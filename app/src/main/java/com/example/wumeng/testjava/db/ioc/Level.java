package com.example.wumeng.testjava.db.ioc;

import javax.inject.Qualifier;

@Qualifier
public @interface Level {
    String value() default "";
}
