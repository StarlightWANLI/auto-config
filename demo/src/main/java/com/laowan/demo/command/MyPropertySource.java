package com.laowan.demo.command;

import org.springframework.core.env.EnumerablePropertySource;

import java.util.Map;

/**
 * @program: auto-config
 * @description:
 * @author: wanli
 * @create: 2020-05-18 11:53
 **/
public class MyPropertySource extends EnumerablePropertySource<Map<String,String>> {

    public MyPropertySource(String name, Map source) {
        super(name, source);
    }

    public MyPropertySource(String myPropertySource) {
        super(myPropertySource);
    }

    //获取所有的配置名字
    @Override
    public String[] getPropertyNames() {
        return source.keySet().toArray(new String[source.size()]);
    }

    //根据配置返回对应的属性
    @Override
    public Object getProperty(String name) {
        return source.get(name);
    }

}
