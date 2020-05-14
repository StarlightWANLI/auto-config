package com.laowan.user.autoconfig;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {
}
