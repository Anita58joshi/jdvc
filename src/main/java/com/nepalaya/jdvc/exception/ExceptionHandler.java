package com.nepalaya.jdvc.exception;

import com.nepalaya.jdvc.util.LogUtil;

public class ExceptionHandler {

    public static void handle(ExceptionWrapper wrapper) {
        try {
            wrapper.process();
        } catch (Exception ex) {
            LogUtil.exception(ex);
        }
    }
}
