package com.beeva.kata2;

/**
 * Created by manuel.duran@beeva.com on 6/11/15.
 * KATAS TDD - Beeva
 * Clase principal del juego
 */
public class Game {

    private Board board;
    private Player[] players;
    private int turn;
    private boolean gameFinish;

    /**
     * Inicia el juego
     */
    public void init() {
        this.board = new Board();

        this.players = new Player[2];
        this.players[0] = new Player('X');
        this.players[1] = new Player('O');

        this.turn = 1;
        this.gameFinish = false;
    }


    public Board getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getTurn() {
        return turn;
    }


    /**
     * Juega un turno
     *
     * @param row Fila del tablero
     * @param col Columna del tablero
     * @return Mensaje con el estado del juego. Si gana un jugador, si es empate, o nulo si no pasa nada
     */
    public String playTurn(int row, int col) {

        if (gameFinish) {
            return "El juego ha finalizado. Si quiere volver a jugar, inicie de nuevo el juego";
        }

        // Compruebo si el jugador ha puesto su marca fuera del tablero
        if (row > this.getBoard().getSquares().length || col > this.getBoard().getSquares()[row - 1].length) {
            return "Fuera de tablero";
        }

        // Como es un array, para comodidad del jugador, resto uno a la fila y columna
        row--;
        col--;

        // Compruebo si la casilla esta ocupada
        if (this.getBoard().getSquares()[row][col].getMark() != '-') {
            return "Casilla ocupada";
        }

        // Como no ha habido errores, pongo la marca en la casilla indicada
        this.getBoard().getSquares()[row][col].setMark(players[turn - 1].getMark());

        // Compruebo si hay ganador
        if (checkHorizontalWinner() || checkVerticalWinner() || checkDiagonalWinner()) {
            gameFinish = true;
            return "Jugador " + this.turn + " GANA!!!";
        }

        // Compruebo si hay empate
        if (checkDraw()) {
            gameFinish = true;
            return "EMPATE!!!";
        }

        // Si no se da ningun caso de ganador o empate, cambio turno
        if (turn == 1) {
            this.turn = 2;
        } else {
            this.turn = 1;
        }

        return null;
    }


    /**
     * Comprueba si existe empate
     *
     * @return Devuelve false si no hay empate, true si existe
     */
    private boolean checkDraw() {
        for (int r = 0; r < this.getBoard().getSquares().length; r++) {
            for (int c = 0; c < this.getBoard().getSquares()[r].length; c++) {
                if (this.getBoard().getSquares()[r][c].getMark() == '-') {
                    return false;
                }
            }
        }

        return true;
    }


    /**
     * Comprueba si hay tres fichas iguales en diagonal
     *
     * @return True si existe ganador, false en caso contrario
     */
    private boolean checkDiagonalWinner() {
        boolean iguales = true;

        for (int rc = 0; rc < 3; rc++) {
            if (this.getBoard().getSquares()[rc][rc].getMark() != this.getPlayers()[this.turn - 1].getMark()) {
                iguales = false;
                break;
            }
        }

        if (!iguales) {
            iguales = true;
            for (int r = 0, c = 2; r < 3 && c >= 0; r++, c--) {
                if (this.getBoard().getSquares()[r][c].getMark() != this.getPlayers()[this.turn - 1].getMark()) {
                    iguales = false;
                    break;
                }
            }
        }

        return iguales;
    }


    /**
     * Comprueba si existen tres fichas iguales en alguna columna
     *
     * @return True si existe, false en caso contrario
     */
    private boolean checkVerticalWinner() {
        boolean iguales = false;

        for (int c = 0; c < 3 && !iguales; c++) {
            iguales = true;
            for (int r = 0; r < this.getBoard().getSquares().length; r++) {
                if (this.getBoard().getSquares()[r][c].getMark() != this.getPlayers()[this.turn - 1].getMark()) {
                    iguales = false;
                    break;
                }
            }
        }

        return iguales;
    }

    /**
     * Comprueba si existen tres fichas en horizontal
     *
     * @return True si existe, false en caso contrario
     */
    private boolean checkHorizontalWinner() {
        boolean iguales = false;

        for (int r = 0; r < this.getBoard().getSquares().length && !iguales; r++) {
            iguales = true;
            for (int c = 0; c < this.getBoard().getSquares()[r].length; c++) {
                if (this.getBoard().getSquares()[r][c].getMark() != this.getPlayers()[this.turn - 1].getMark()) {
                    iguales = false;
                    break;
                }
            }
        }

        return iguales;
    }


}
