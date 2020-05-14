package com.laowan.demo;

import com.laowan.user.autoconfig.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Autowired
    UserClient userClient;

    @Test
    void contextLoads() {
    }

    @Test
    void userClientTest() {
        log.info(userClient.getName());
    }

}
