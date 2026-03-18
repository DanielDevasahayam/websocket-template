package com.javatechie.service;

import com.javatechie.dto.MatchResultDTO;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class MatchMakingService {

    private Queue<String> waitingQueue = new ConcurrentLinkedQueue<>();

    public synchronized MatchResultDTO findMatch(String playerId) {
        System.out.println("I came here");
        if (waitingQueue.isEmpty()) {
            waitingQueue.add(playerId);
            return null; // wait for opponent
        }

        String opponent = waitingQueue.poll();

        String roomId = UUID.randomUUID().toString();

        return new MatchResultDTO(playerId, opponent, roomId);
    }

}
