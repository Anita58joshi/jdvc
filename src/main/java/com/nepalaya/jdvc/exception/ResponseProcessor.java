package com.nepalaya.jdvc.exception;

import com.nepalaya.jdvc.builder.ResponseBuilder;
import com.nepalaya.jdvc.response.Response;
import com.nepalaya.jdvc.util.LogUtil;

public class ResponseProcessor {

    public static Response process(ExceptionDataWrapper exceptionDataWrapper){
        try{
            return exceptionDataWrapper.handle();
        }catch (Exception ex){
            LogUtil.exception(ex);
            return ResponseBuilder.failure(ex.getMessage());
        }
    }
}
