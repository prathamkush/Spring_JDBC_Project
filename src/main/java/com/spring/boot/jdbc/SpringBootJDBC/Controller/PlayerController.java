package com.spring.boot.jdbc.SpringBootJDBC.Controller;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerDAO;
import com.spring.boot.jdbc.SpringBootJDBC.ServiceLayer.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

//    @Autowired
//    PlayerDAO obj = new PlayerDAO();

    @Autowired
    PlayerService service;

    @GetMapping("/playersInfo")
    public List<Player> getPlayerData(){
        return service.getAllPlayers();
    }
    @GetMapping("/welcome")
    public String welcome(){ return "Welcome to Player Entity";}

    @GetMapping("/player/{id}")
    public Player getPlayer(@PathVariable int id) {
        return service.findPlayerByID(id);
    }




//    @GetMapping("/playerById")
//    public Player getPlayerDataById(){
//        return obj.getPlayerbyId();
//    }

}
