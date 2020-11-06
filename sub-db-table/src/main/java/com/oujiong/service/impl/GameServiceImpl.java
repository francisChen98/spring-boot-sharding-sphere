package com.oujiong.service.impl;

import com.oujiong.entity.Game;
import com.oujiong.mapper.GameMapper;
import com.oujiong.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    @Override
    public List<Game> list() {
        return gameMapper.selectAll();
    }

    @Override
    public String insert(Game game) {
        gameMapper.insert(game);
        return "保存成功";
    }
}
