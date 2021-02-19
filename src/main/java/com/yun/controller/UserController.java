package com.yun.controller;

import com.yun.dto.LoginDto;
import com.yun.model.SUser;
import com.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @date 2021/2/19
 */
@Controller
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String login(LoginDto loginEntity){
        boolean validateSuccess = true;
        return "200";
    }

    public SUser getInfo(Integer userId){
        return userService.getInfoByUserId(userId);
    }

}
