package com.javatechie.controller;

import com.javatechie.dto.MatchResultDTO;
import com.javatechie.service.MatchMakingService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Queue;

@Controller
@AllArgsConstructor
public class MatchPlayerController {

    private final MatchMakingService matchMakingService;
    //server application
    //app/sendMessage
    ///app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message){
        System.out.println("message : "+message);
        return message;
    }

    @MessageMapping("/findPlayersInQueue")
    @SendTo("/topic/queue")
    public MatchResultDTO findPlayersInQueue(String playerId) {
        System.out.println("playerid : " + playerId);
        return matchMakingService.findMatch(playerId);
//        return "Response";
    }



}
