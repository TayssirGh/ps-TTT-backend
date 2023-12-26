package com.example.psbackend.model;

import lombok.Data;

@Data
public class SmallBoard {
    private State[][] board;
    private State winner;
    public SmallBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = State.NULL;
            }
        }
        this.winner = State.NULL;
    }
}
