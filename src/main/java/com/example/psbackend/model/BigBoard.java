package com.example.psbackend.model;

import lombok.Data;

@Data
public class BigBoard {
    private SmallBoard[][] boards ;
    private CurrentPlayer player;
    private State winner;

    public BigBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            this.boards[i][j] = new SmallBoard();
        }
    }
    this.player = CurrentPlayer.PLAYER1;
    this.winner = State.NULL;


    }

}
