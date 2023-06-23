package com.Adi.UserManagement.System.Configration;

import com.Adi.UserManagement.System.model.User;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeenManager {

    @Bean
    public List<User> getInitializedList(){
        User initUser=new User(1,"Subhash","lucknow","9876543210");
        List<User>initList=new ArrayList<>();
        initList.add(initUser);
        return initList;
    }



}
