package com.oujiong.mapper;


import com.oujiong.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 用户mapper
 *
 * @author xub
 * @date 2019/10/8 下午9:23
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * 插入一条记录
     *
     * @param record 实体对象
     * @return 更新条目数
     */
    @Insert({
            "insert into tab_user (id, name, sex,",
            "age, create_time, update_time,",
            "status)",
            "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR},",
            "#{age,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP},",
            "#{status,jdbcType=INTEGER})"
    })
    int insert(User record);

    /**
     * 获取所有用户
     */
    @Select({
            "SELECT id, name, sex, age, create_time, update_time, status FROM tab_user "
    })
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "age", column = "age"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "status", column = "status")
    })
    List<User> selectAll();

}