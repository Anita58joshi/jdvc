package com.nepalaya.jdvc.exception;

import com.nepalaya.jdvc.response.Response;

@FunctionalInterface
public interface ExceptionDataWrapper {
    Response handle() throws Exception;
}