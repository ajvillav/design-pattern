package com.pattern.design.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerHistory game = new PlayerHistory();

        player.setLocation(10, 20);
        log.info(player.toString());

        // Save player state
        game.saveState(player);

        // Change player location
        player.setLocation(50, 100);
        log.info(player.toString());

        // Restore saved location from specific date
        game.returnToOlderState(LocalDate.now(), player);
        log.info(player.toString());
    }
}
