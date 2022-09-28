package com.spring.boot.jdbc.SpringBootJDBC.ServiceLayer;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerRepository;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerSpringDataRepository repo;

    // getAllPlayers
    public List<Player> getAllPlayers(){
        return repo.findAll();
    }

     // http:localhost:8080/{{"arjun"}}
    //findbyid
    public Player findPlayerByID(@PathVariable("id") int id){
        Optional<Player> tempPlayer = repo.findById(id);
        //repo.getOne(id) -> deprecated

        Player p = null;

        if(tempPlayer.isPresent()) p = tempPlayer.get();
        else{
            throw new RuntimeException("Player with id : "+id+" not found ");
        }
        return p;
    }








}
