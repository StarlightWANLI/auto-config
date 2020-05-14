package com.laowan.user.autoconfig;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @ConfigurationPropertiesz这个注解，是根据属性前缀，注入配置项
 *
 * 但是需要配合  @EnableConfigurationProperties(UserPorperties.class) 或者   @Component   来使用
 */
@Data
@ConfigurationProperties("spring.user")
public class UserPorperties {
    private String name;
}
