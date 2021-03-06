package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 主线任务表.csv
 * 编号 = id
 * 是否是最后一主线任务 = end
 * 引导ID = guideId
 * 背景ID = bjId
 * 背景音ID = bjVoiceid
 * 男前置任务编号 = mPrevid
 * 男后续任务编号 = mNextid
 * 男任务名称 = mName
 * 男任务描述 = mDescribe
 * 男任务ID = mMissionid
 * 男NPC对话组ID = mTalkid
 * 对应引导ID = guide
 * 女前置任务编号 = fPrevid
 * 女后续任务编号 = fNextid
 * 女任务名称 = fName
 * 女任务描述 = fDescribe
 * 女任务ID = fMissionid
 * 女NPC对话组ID = fTalkid
 */
public class ZhuxianrenwuData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    30000, map("id", 30000, "mPrevid", 0, "mNextid", 30001, "mName", "剧情战斗（打第一关）", "mDescribe", "小主可是想知晓关于娴妃娘娘的故事以便报答娴妃娘娘的恩情，那老奴悄悄告知小主，您可以前去剧情剧情查看娴妃娘娘从入宫前到入宫后的剧情。【请小主打通剧情第一章第一关卡】", "mMissionid", 30000, "fPrevid", 0, "fNextid", 30001, "fName", "剧情战斗（打第一关）", "fDescribe", "小主可是想知晓关于娴妃娘娘的故事以便报答娴妃娘娘的恩情，那老奴悄悄告知小主，您可以前去剧情剧情查看娴妃娘娘从入宫前到入宫后的剧情。【请小主打通剧情第一章第一关卡】", "fMissionid", 30000),
    30001, map("id", 30001, "mPrevid", 30000, "mNextid", 30002, "mName", "强化", "mDescribe", "小主，老奴依旧放心不下小主，老奴建议小主再前去强化一下筋骨才好应付那些心狠手辣之人。【请小前去仆从界面点击强化按钮】", "mMissionid", 30001, "fPrevid", 30000, "fNextid", 30002, "fName", "强化", "fDescribe", "小主，老奴依旧放心不下小主，老奴建议小主再前去强化一下筋骨才好应付那些心狠手辣之人。【请小前去仆从界面点击强化按钮】", "fMissionid", 30001),
    30002, map("id", 30002, "mPrevid", 30001, "mNextid", 30003, "mName", "剧情战斗（打第三关）", "mDescribe", "老奴看小主精神抖擞，小主可放心前去剧情战斗了。【请小主打通剧情第一章第三关卡】", "mMissionid", 30002, "fPrevid", 30001, "fNextid", 30003, "fName", "剧情战斗（打第三关）", "fDescribe", "老奴看小主精神抖擞，小主可放心前去剧情战斗了。【请小主打通剧情第一章第三关卡】", "fMissionid", 30002),
    30003, map("id", 30003, "mPrevid", 30002, "mNextid", 30004, "mName", "招募", "mDescribe", "小主为何如此伤神，可要仔细玉体，娴妃娘娘给小主支招，让小主去寻觅一二贴心仆从，这样会对小主有极大的帮助。【请小主点击仆从按钮前去招募仆从】", "mMissionid", 30003, "fPrevid", 30002, "fNextid", 30004, "fName", "招募", "fDescribe", "小主为何如此伤神，可要仔细玉体，娴妃娘娘给小主支招，让小主去寻觅一二贴心仆从，这样会对小主有极大的帮助。【请小主点击仆从按钮前去招募仆从】", "fMissionid", 30003),
    30004, map("id", 30004, "mPrevid", 30003, "mNextid", 30005, "mName", "上阵", "mDescribe", "小主，既然已招募到忠心的仆从，那就让他们各司其职，尽忠职守吧。【请小主点击仆从按钮前去布阵】", "mMissionid", 30004, "fPrevid", 30003, "fNextid", 30005, "fName", "上阵", "fDescribe", "小主，既然已招募到忠心的仆从，那就让他们各司其职，尽忠职守吧。【请小主点击仆从按钮前去布阵】", "fMissionid", 30004)
);
    }

    private static void init1() {
data.map(
    30005, map("id", 30005, "mPrevid", 30004, "mNextid", 30006, "mName", "剧情战斗（打通全关）", "mDescribe", "小主可是要再去一探究竟，现有仆从陪同，老奴也能放心了。【请小主打通剧情第一章全部关卡】", "mMissionid", 30005, "fPrevid", 30004, "fNextid", 30006, "fName", "剧情战斗（打通全关）", "fDescribe", "小主可是要再去一探究竟，现有仆从陪同，老奴也能放心了。【请小主打通剧情第一章全部关卡】", "fMissionid", 30005),
    30006, map("id", 30006, "mPrevid", 30005, "mNextid", 30007, "mName", "添加好友一位", "mDescribe", "晴格格见小主近几日心情不好，特意提醒小主多交些好友，既能缓解小主心情他日还能为小主帮忙。【请小主→点击好友按钮→选择添加好友界面→加好友】", "mMissionid", 30006, "mTalkid", list(2042, 2043, 2044), "fPrevid", 30005, "fNextid", 30007, "fName", "添加好友一位", "fDescribe", "晴格格见小主近几日心情不好，特意提醒小主多交些好友，既能缓解小主心情他日还能为小主帮忙。【请小主→点击好友按钮→选择添加好友界面→加好友】", "fMissionid", 30006),
    30007, map("id", 30007, "mPrevid", 30006, "mNextid", 30008, "mName", "上阵4个仆从", "mDescribe", "蕊心为小主出谋划策，建议小主招募仆从培养自己的势力才能不那么轻易被打败，方能站稳脚跟。【请小主点击仆从→点击第二个标签招募→选中所需仆从→点击招募】", "mMissionid", 30007, "mTalkid", list(2030, 2031), "fPrevid", 30006, "fNextid", 30008, "fName", "上阵4个仆从", "fDescribe", "蕊心为小主出谋划策，建议小主招募仆从培养自己的势力才能不那么轻易被打败，方能站稳脚跟。【请小主点击仆从→点击第二个标签招募→选中所需仆从→点击招募】", "fMissionid", 30007),
    30008, map("id", 30008, "mPrevid", 30007, "mNextid", 30009, "mName", "通关普通关卡第二章", "mDescribe", "通关普通关卡第二章", "mMissionid", 30008, "fPrevid", 30007, "fNextid", 30009, "fName", "通关普通关卡第二章", "fDescribe", "通关普通关卡第二章", "fMissionid", 30008),
    30009, map("id", 30009, "mPrevid", 30008, "mNextid", 30010, "mName", "战斗力达到12000", "mDescribe", "公公提醒小主，若想升官职就需战斗力达到12000。", "mMissionid", 30009, "fPrevid", 30008, "fNextid", 30010, "fName", "战斗力达到12000", "fDescribe", "公公提醒小主，若想升官职就需战斗力达到12000。", "fMissionid", 30009)
);
    }

    private static void init2() {
data.map(
    30010, map("id", 30010, "mPrevid", 30009, "mNextid", 30011, "mName", "在聊天综合频道中说一句话", "mDescribe", "皇后娘娘见小主独得恩宠心生嫉妒，召见小主并讥讽小主一番，强行命令小主跟各宫娘娘前去聊天说话。", "mMissionid", 30010, "mTalkid", list(2045, 2046, 2047, 2048, 2049), "fPrevid", 30009, "fNextid", 30011, "fName", "在聊天综合频道中说一句话", "fDescribe", "皇后娘娘见小主独得恩宠心生嫉妒，召见小主并讥讽小主一番，强行命令小主跟各宫娘娘前去聊天说话。", "fMissionid", 30010),
    30011, map("id", 30011, "mPrevid", 30010, "mNextid", 30012, "mName", "登陆第二天", "mDescribe", "小主，请您检查登陆二天哦~勤劳的小主才会讨太后欢心。", "mMissionid", 30011, "fPrevid", 30010, "fNextid", 30012, "fName", "登陆第二天", "fDescribe", "小主，请您检查登陆二天哦~勤劳的小主才会讨太后欢心。", "fMissionid", 30011),
    30012, map("id", 30012, "mPrevid", 30011, "mNextid", 30013, "mName", "剧情战斗第三章", "mDescribe", "老奴恭迎小主，小主可是想继续了解娴妃娘娘过往，请打通剧情第三章全部关卡。", "mMissionid", 30012, "fPrevid", 30011, "fNextid", 30013, "fName", "剧情战斗第三章", "fDescribe", "老奴恭迎小主，小主可是想继续了解娴妃娘娘过往，请打通剧情第三章全部关卡。", "fMissionid", 30012),
    30013, map("id", 30013, "mPrevid", 30012, "mNextid", 30014, "mName", "战斗力（2）", "mDescribe", "老奴恭迎小主，小主可是想继续了解娴妃娘娘过往，请打通剧情第四章全部关卡。", "mMissionid", 30013, "fPrevid", 30012, "fNextid", 30014, "fName", "战斗力（2）", "fDescribe", "老奴恭迎小主，小主可是想继续了解娴妃娘娘过往，请打通剧情第四章全部关卡。", "fMissionid", 30013),
    30014, map("id", 30014, "mPrevid", 30013, "mNextid", 30015, "mName", "剧情战斗第四章", "mDescribe", "请小主努力提升战力吧！", "mMissionid", 30014, "fPrevid", 30013, "fNextid", 30015, "fName", "剧情战斗第四章", "fDescribe", "请小主努力提升战力吧！", "fMissionid", 30014)
);
    }

    private static void init3() {
data.map(
    30015, map("id", 30015, "mPrevid", 30014, "mNextid", 0, "mName", "聊天一次（2）", "mDescribe", "请小主在聊天综合频道中聊天，近日多与各位小主家聊聊天巩固一下感情。", "mMissionid", 30015, "fPrevid", 30014, "fNextid", 0, "fName", "聊天一次（2）", "fDescribe", "请小主在聊天综合频道中聊天，近日多与各位小主家聊聊天巩固一下感情。", "fMissionid", 30015)
);
    }

}