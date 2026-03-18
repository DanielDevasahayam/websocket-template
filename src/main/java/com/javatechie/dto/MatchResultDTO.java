package com.javatechie.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchResultDTO {
    private String playerId;

    private String opponent;
    private String roomId;


}
