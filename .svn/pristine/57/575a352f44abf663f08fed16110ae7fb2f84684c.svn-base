package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ArrayUtils;

/**
 * @author bezy
 * 
 */
public class CookieUtils {
    public static final int COOKIE_NOTSTORE = -1;
    public static final int COOKIE_EXPIRE = 0;
    public static final int COOKIE_AGE_6_HOUR = 6 * 3600;
    public static final int COOKIE_AGE_DAY = 4 * COOKIE_AGE_6_HOUR;
    public static final int COOKIE_AGE_MONTH = 30 * COOKIE_AGE_DAY;
    public static final int COOKIE_AGE_YEAR = 12 * COOKIE_AGE_MONTH;
    public static final String OLD_COOKIE_PATTERN = "EEE, dd-MMM-yyyy HH:mm:ss z";

    public static String getCookieValue(HttpServletRequest request, String cookieName, String... defaultValue) {
        String dv = ArrayUtils.isEmpty(defaultValue) ? null : defaultValue[0];
        Cookie[] cookieList = request.getCookies();
        if (cookieList == null) {
            return dv;
        }
        for (Cookie cookie : cookieList) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return dv;
    }

    public static void rmCookie(HttpServletRequest request, HttpServletResponse response, String cookieName) {
        setCookieMaxAge(request, response, cookieName, 0);
    }

    public static void setCookieMaxAge(HttpServletRequest request, HttpServletResponse response, String cookieName,
            int maxAge) {
        Cookie cookieList[] = request.getCookies();
        if (cookieList == null) {
            return;
        }
        Cookie newCookie;
        for (Cookie cookie : cookieList) {
            if (cookie.getName().equals(cookieName)) {
                newCookie = (Cookie) cookie.clone();
                newCookie.setMaxAge(maxAge);
                response.addCookie(newCookie);
            }
        }
    }

    public static Cookie makeCookie(String key, String value, String domain, int maxAge, String path) {
        if (key == null || value == null) {
            return null;
        }
        Cookie ck = new Cookie(key, value);
        if (domain != null) {
            ck.setDomain(domain);
        }
        ck.setMaxAge(maxAge);
        if (path != null) {
            ck.setPath(path);
        } else {
            ck.setPath("/");
        }
        return ck;
    }

    public static Cookie makeCookieExpireForApp(String key, String value, String domain, String path) {
        return makeCookie(key, value, domain, 0, path);
    }

    public static void addCookieCrossdomain(HttpServletResponse response, Cookie cookie) {
        if (response != null && cookie != null) {
            response.addCookie(cookie);
            response.addHeader("P3P",
                    "CP=\"CURa ADMa DEVa PSAo PSDo OUR BUS UNI PUR INT DEM STA PRE COM NAV OTC NOI DSP COR\"");
        }
    }

    public static String getNonSpecCookieValue(HttpServletRequest request, String key, String... defaultValue) {
        String dv = ArrayUtils.isEmpty(defaultValue) ? null : defaultValue[0];
        String cookies = request.getHeader("Cookie");
        if (cookies != null) {
            Pattern pattern = Pattern.compile("(^|;)\\s*" + key + "=([^;]*)(;|$)");
            Matcher matcher = pattern.matcher(cookies);
            if (matcher.find()) {
                return matcher.group(2);
            }
        }
        return dv;
    }

    public static void addNonSpecCookie(HttpServletResponse response, String key, String value, String domain,
            int maxAge, String path, boolean isSecure, boolean isHttpOnly) {
        StringBuilder sb = new StringBuilder();
        sb.append(key + "=" + value);
        if (maxAge >= 0) {
            if (maxAge == 0) {
                sb.append("; Expires=" + formatGMTDate(1000L, OLD_COOKIE_PATTERN));
            } else {
                sb.append("; Expires=" + formatGMTDate(System.currentTimeMillis() + maxAge * 1000L, OLD_COOKIE_PATTERN));
            }
        }
        if (path != null) {
            sb.append("; Path=" + path);
        }
        if (domain != null) {
            sb.append("; Domain=" + domain);
        }
        if (isSecure) {
            sb.append("; Secure");
        }
        if (isHttpOnly) {
            sb.append("; HttpOnly");
        }
        response.addHeader("Set-Cookie", sb.toString());
    }

    public static void addNonSpecCookie(HttpServletResponse response, String key, String value, String domain,
            int maxAge, String path) {
        addNonSpecCookie(response, key, value, domain, maxAge, path, false, false);
    }

    public static void addNonSpecCookieExpireForApp(HttpServletResponse response, String key, String value,
            String domain, String path) {
        addNonSpecCookie(response, key, value, domain, 0, path);
    }

    public static String formatGMTDate(long date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UK"));
        String str = dateFormat.format(date);
        return str;
    }

}
