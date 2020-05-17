package com.laowan.demo.command;


import com.laowan.demo.util.ServerPortUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;


/**
 * 开始命令
 */
@Slf4j
public class StartCommand {

    public StartCommand(String[] args){
         Boolean isServerPort = false;
         String serverPort = "";
         if(args != null){
              for (String arg:args){
                    if(StringUtils.hasText(arg) &&
                            arg.startsWith("--server.port")
                    ){
                        isServerPort = true;
                        serverPort = arg;
                        break;
                    }
              }
         }

         //没有指定端口，则随机生成一个可用的端口
        if(!isServerPort){
              int port = ServerPortUtils.getAvailablePort();
              log.info("current server.port=" + port);
              System.setProperty("server.port",String.valueOf(port));
        }else{//指定了端口，则以指定的端口为准
            log.info("current server.port=" + serverPort.split("=")[1]);
            System.setProperty("server.port",serverPort.split("=")[1]);
        }
    }

}
