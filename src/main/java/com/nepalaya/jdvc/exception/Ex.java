package com.nepalaya.jdvc.exception;

import com.nepalaya.jdvc.util.LogUtil;

public class Ex {

    public static void caught(ExceptionWrapper wrapper) {
        try {
            wrapper.handle();
        } catch (Exception ex) {
            LogUtil.exception(ex);
        }
    }
}