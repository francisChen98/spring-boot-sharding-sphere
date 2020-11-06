package com.oujiong.mapper;

import com.oujiong.entity.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GameMapper {

    /**
     * 批量插入
     *
     * @param
     * @return 插入数量
     */
    int insert(Game game);

    /**
     * 获取所有用户
     */
    List<Game> selectAll();
}
