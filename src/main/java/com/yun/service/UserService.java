package com.yun.service;

import com.yun.dto.LoginDto;
import com.yun.model.SUser;
import com.yun.repository.SUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * TODO
 *
 * @date 2021/2/19
 */
@Service
public class UserService {

    @Autowired
    private SUserRepository sUserRepository;

    public SUser getInfoByUserId(Integer userId) {

        Optional<SUser> sUser = sUserRepository.findById(userId);
        return sUser.orElse(null);
    }

    public SUser login(LoginDto loginEntity){
        validateLogin(loginEntity);
        return null;
    }

    private void validateLogin(LoginDto loginEntity) {
        //sUserRepository.find
    }
}
