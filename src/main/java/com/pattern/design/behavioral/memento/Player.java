package com.pattern.design.behavioral.memento;

import lombok.Getter;

@Getter
public class Player {

    private int locationX;
    private int locationY;

    public void setLocation(int x, int y) {
        this.locationX = x;
        this.locationY = y;
    }

    // Guarda el estado actual dentro de un memento.
    public Memento save() {
        return new Memento(locationX, locationY);
    }

    // Restaura el estado desde el memento.
    public void restore(Object memento) {
        this.locationX = ((Memento) memento).getLocationX();
        this.locationY = ((Memento) memento).getLocationY();
    }

    public String toString() {
        return "Player location: [X=" + locationX + ", Y=" + locationY + "]";
    }

    @Getter
    private class Memento {

        int locationX;
        int locationY;

        private Memento(int locationX, int locationY) {
            this.locationX = locationX;
            this.locationY = locationY;
        }

    }
}
