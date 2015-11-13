package com.beeva.kata2;

/**
 * Created by manuel.duran@beeva.com on 6/11/15.
 * KATAS TDD - Beeva
 * Clase tablero
 */
public class Board {
    private Square[][] squares;

    public Board() {
        this.squares = new Square[3][3];
        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {
                this.squares[row][col] = new Square();
            }
        }
    }

    public Square[][] getSquares() {
        return squares;
    }
}
