package com.oujiong.service;

import com.oujiong.entity.Game;

import java.util.List;

public interface GameService {

    /**
     * 获取所有用户信息
     */
    List<Game> list();

    /**
     *
     * @param game
     */
    String  insert(Game game);
}
