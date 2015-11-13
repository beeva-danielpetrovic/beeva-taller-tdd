package com.beeva.kata2;

/**
 * Created by manuel.duran@beeva.com on 6/11/15.
 * KATAS TDD - Beeva
 * Clase casilla
 */
public class Square {
    private char mark;

    public Square() {
        this.mark = '-';
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }
}
