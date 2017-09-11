package cn.jing.hello.web.service;

import cn.jing.hello.web.mapper.RlUserMapperCustom;
import cn.jing.hello.web.po.RlUser;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private RlUserMapperCustom rlUserMapperCustom;


    public RlUser getByUserId(int userId) throws Exception {
        System.out.println("加载的资源是" + rlUserMapperCustom);
        return rlUserMapperCustom.getByUserId(userId);
    }
}
