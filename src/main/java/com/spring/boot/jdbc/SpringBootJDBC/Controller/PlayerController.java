package com.spring.boot.jdbc.SpringBootJDBC.Controller;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerDAO obj = new PlayerDAO();

    @GetMapping("/playersInfo")
    public List<Player> getPlayerData(){
        return obj.getAllPlayers();
    }


//    @GetMapping("/playerById")
//    public Player getPlayerDataById(){
//        return obj.getPlayerbyId();
//    }

}