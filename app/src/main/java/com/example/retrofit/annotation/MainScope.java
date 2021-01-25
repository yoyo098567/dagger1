package com.example.retrofit.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
//無用
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MainScope {

}
