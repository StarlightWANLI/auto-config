package com.laowan.user.autoconfig;

public class UserClient {

    private UserPorperties userPorperties;

    public UserClient(){

    }

    public UserClient(UserPorperties userPorperties){
          this.userPorperties = userPorperties;
    }

    public String getName(){
        return userPorperties.getName();
    }
}
