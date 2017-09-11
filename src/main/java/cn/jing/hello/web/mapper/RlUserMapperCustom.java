package cn.jing.hello.web.mapper;

import cn.jing.hello.web.po.RlUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface RlUserMapperCustom {
    RlUser getByUserId(@Param("userId") int userId);
}
