package cn.jing.hello.web.service;

import cn.jing.hello.web.po.RlUser;

public interface UserService {
    RlUser getByUserId(int userId) throws Exception;
}
