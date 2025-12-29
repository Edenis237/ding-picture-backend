package com.ding.dingpicturebackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 注解会在运行时保留
public @interface AuthCheck {
    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";
}
