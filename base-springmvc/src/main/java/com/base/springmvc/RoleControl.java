package com.base.springmvc;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * Created by xuyuli on 2016/12/8.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
//最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RoleControl {

    /**
     * 角色类型，以便决定是否具有相关权限
     */
    RoleCodeEnum [] value() default RoleCodeEnum.ALL;
}
