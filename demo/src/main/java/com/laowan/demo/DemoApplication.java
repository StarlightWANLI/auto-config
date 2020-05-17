package com.laowan.demo;

import com.laowan.demo.command.MyRandomValuePropertySource;
import com.laowan.demo.command.StartCommand;
import com.laowan.user.autoconfig.EnableUserClient;
import com.laowan.user.autoconfig.UserClient;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableUserClient
public class DemoApplication {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
      //  new StartCommand(args);
        SpringApplication.run(new Class[]{DemoApplication.class,MyRandomValuePropertySource.class}, args);
    }
}
