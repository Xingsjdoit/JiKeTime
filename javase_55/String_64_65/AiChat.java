package com.jiketime.javase_55;

/**
 * @Author xing
 * @create 2022/5/29 22:10
 */
public class AiChat {
    public String answer(String question) {
        String ret = null;

        ret = handleCanStart(question);
        if (ret != null) {
            return ret;
        }

        ret = handleAskEnd(question);
        if (ret != null) {
            return ret;
        }

        return handleUnknown(question);
    }

    private String handleCanStart(String question) {
        String[] canStarts = {"会", "能", "有", "敢", "在"};
        for (int i = 0; i < canStarts.length; i++) {
            if (question.startsWith(canStarts[i])){
                return canStarts[i] + "!";
            }
        }
        return null;

    }

    private String handleAskEnd(String question) {
        String[] askEnds = {"吗？", "吗", "吗?"};
        for (int i = 0; i < askEnds.length; i++) {
            if (question.endsWith(askEnds[i])){
                return question.replace(askEnds[i],"!");
            }
        }
        return null;
    }

    private String handleUnknown(String question) {
        return question+"!";

    }
}
