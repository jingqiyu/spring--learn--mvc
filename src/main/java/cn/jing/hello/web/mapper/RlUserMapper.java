package cn.jing.hello.web.mapper;

import cn.jing.hello.web.po.RlUser;
import cn.jing.hello.web.po.RlUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RlUserMapper {
    long countByExample(RlUserExample example);

    int deleteByExample(RlUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RlUser record);

    int insertSelective(RlUser record);

    List<RlUser> selectByExample(RlUserExample example);

    RlUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RlUser record, @Param("example") RlUserExample example);

    int updateByExample(@Param("record") RlUser record, @Param("example") RlUserExample example);

    int updateByPrimaryKeySelective(RlUser record);

    int updateByPrimaryKey(RlUser record);
}