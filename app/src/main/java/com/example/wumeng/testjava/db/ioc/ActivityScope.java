package com.example.wumeng.testjava.db.ioc;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Scope
public @interface ActivityScope {}
