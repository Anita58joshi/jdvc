package com.nepalaya.jdvc.exception;

@FunctionalInterface
public interface ExceptionWrapper {
    void handle() throws Exception;
}