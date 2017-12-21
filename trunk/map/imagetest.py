#!/usr/bin/env python

from PIL import Image, ImageDraw
import time

# The Python Imaging Library uses a coordinate system with (0, 0) in the upper left corner. 

tileWidth = 200
tileHeight = 100
tileCount = 4
tileCutMore = 2 # more cut 2 px
fileName = "dibiao4.png"
fileName = fileName.split('.')[0]

startX = 0
startY = tileHeight * tileCount * 0.5 - tileHeight * 0.5

width = tileWidth + tileCutMore
height = tileHeight + tileCutMore
halfWidth = int(width * 0.5)
halfHeight = int(height * 0.5)

im = Image.open(fileName + ".png")
#print(im.format, im.size, im.mode)
for i in range(tileCount):
	startX2 = int(startX + tileWidth * 0.5 * i)
	startY2 = int(startY + tileHeight * 0.5 * i)
	for j in range(tileCount):
		x = startX2 + j * int(tileWidth * 0.5)
		y = startY2 - j * int(tileHeight * 0.5)

		box = (x, y, x + width, y + height)
		region = im.crop(box)
		name = fileName + "_" + bytes(i) + "_" + bytes(j) + ".png"
		region.save(name, "PNG")
		im2 = Image.open(name)
		temp = ImageDraw.Draw(im2)
		temp.polygon([(0, 0), (0, halfHeight), (halfWidth, 0)], fill=(0,0,0,0))
		temp.polygon([(0, halfHeight), (0, height), (halfWidth, height)], fill=(0,0,0,0))
		temp.polygon([(halfWidth, height), (width, height), (width, halfHeight)], fill=(0,0,0,0))
		temp.polygon([(halfWidth, 0), (width, halfHeight), (width, 0)], fill=(0,0,0,0))
		im2.save(name, "PNG")

print("cut pic finish")