package cn.oauth.service.impl;

import org.springframework.stereotype.Service;

import cn.oauth.service.ILoginService;

/**
 * Created by Administrator on 2014/7/23.
 */
@Service
public class LoginServiceImpl implements ILoginService {
	@Override
    public boolean login(String userName, String pwd) {
        if(userName=="irving"){
            return true;
        }
        return false;
    }
}
