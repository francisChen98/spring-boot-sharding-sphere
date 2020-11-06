package com.oujiong.controller;


import com.google.common.collect.Lists;
import com.oujiong.entity.Game;
import com.oujiong.entity.User;
import com.oujiong.service.GameService;
import com.oujiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;


/**
 * @Description: 接口测试
 *
 * @author xub
 * @date 2019/8/24 下午6:31
 */
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    /**
     * @Description: 批量保存用户
     */
    @PostMapping("save-game")
    public Object saveUser() {
        Game game = new Game();
        game.setName("francis");
        return gameService.insert(game);
    }
    /**
     * @Description: 获取用户列表
     */
    @GetMapping("list-game")
    public Object listUser() {
        return gameService.list();
    }


}
