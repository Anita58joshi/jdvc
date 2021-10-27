package com.nepalaya.jdvc.exception;

@FunctionalInterface
public interface ExceptionWrapper {
    void process() throws Exception;
}
