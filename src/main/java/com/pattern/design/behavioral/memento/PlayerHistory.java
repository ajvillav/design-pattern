package com.pattern.design.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

import java.util.HashMap;

@Slf4j
public class PlayerHistory {

    private HashMap<LocalDate, Object> backupHistory = new HashMap<>();

    public void saveState(Player player) {
        LocalDate now = LocalDate.now();
        backupHistory.put(LocalDate.now(), player.save());
        log.info(String.format("State saved with date %s and location %s", now, player.toString()));
    }

    public void returnToOlderState(LocalDate date, Player player) {
        if (backupHistory != null) {
            player.restore(backupHistory.get(date));
            log.info(String.format("State restored to data with date %s and location %s", date, player.toString()));
        }
    }

}
