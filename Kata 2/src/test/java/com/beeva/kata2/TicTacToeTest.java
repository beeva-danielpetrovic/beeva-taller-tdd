package com.beeva.kata2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by manuel.duran@beeva.com on 6/11/15.
 * KATAS TDD - Beeva
 * Diseño principal del juego
 */
public class TicTacToeTest {

    private Game game = new Game();

    @Before
    public void setUp() {
        this.game.init();
    }


    @Test
    public void givenAGame_whenInit_thenCreateBoard() {
        Board board = game.getBoard();
        assertThat(board, is(not(nullValue())));
    }


    @Test
    public void givenAGame_whenInit_thenBoardIs3x3Square() {
        Board board = game.getBoard();
        Square[][] squares = board.getSquares();

        assertThat(squares, is(not(nullValue())));
        assertThat(squares.length, is(3));
        for (int row = 0; row < squares.length; row++) {
            assertThat(squares[row].length, is(3));
            for (int col = 0; col < squares[row].length; col++) {
                assertThat(squares[row][col], is(not(nullValue())));
            }
        }
    }


    @Test
    public void givenAGame_whenInit_thenBoardIsEmpty() {
        Board board = game.getBoard();
        Square[][] squares = board.getSquares();

        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {
                assertThat(squares[row][col].getMark(), is('-'));
            }
        }
    }


    @Test
    public void givenAGame_whenInit_thenTwoPlayers() {
        Player[] players = game.getPlayers();
        assertThat(players, is(not(nullValue())));
        assertThat(players.length, is(2));
        for (int i = 0; i < players.length; i++) {
            assertThat(players[i], is(not(nullValue())));
        }
    }


    @Test
    public void givenAGame_whenInit_thenPlayerOnePlayWithX() {
        Player playerOne = game.getPlayers()[0];
        assertThat(playerOne.getMark(), is('X'));
    }


    @Test
    public void givenAGame_whenInit_thenPlayerTwoPlayWithO() {
        Player playerTwo = game.getPlayers()[1];
        assertThat(playerTwo.getMark(), is('O'));
    }


    @Test
    public void givenAGame_whenInit_thenTurnIsPlayerOne() {
        int turn = game.getTurn();
        assertThat(turn, is(1));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerPlay_thenPutMarkInSquare() {
        game.playTurn(1, 1);
        assertThat(game.getBoard().getSquares()[0][0].getMark(), is('X'));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerPlay_thenTurnIsOtherPlayer() {
        game.playTurn(1, 1);
        assertThat(game.getTurn(), is(2));
    }


    @Test
    public void givenAInitiatedGame_whenTwoPlayersPlaying_thenTurnAndMarkChange() {
        game.playTurn(1, 1);
        assertThat(game.getBoard().getSquares()[0][0].getMark(), is('X'));
        assertThat(game.getTurn(), is(2));
        game.playTurn(2, 2);
        assertThat(game.getBoard().getSquares()[1][1].getMark(), is('O'));
        assertThat(game.getTurn(), is(1));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerPutMarkOutBoard_thenReturnMessage() {
        String message = game.playTurn(10, 10);
        assertThat(message, is("Fuera de tablero"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerPutMarkOccupiedSquare_thenReturnMessage() {
        String message = game.playTurn(1, 1);
        assertThat(message, is(nullValue()));
        message = game.playTurn(1, 1);
        assertThat(message, is("Casilla ocupada"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInRowOne_thenWinAndReturnMessage() {
        game.playTurn(1, 1);
        game.playTurn(2, 2);
        game.playTurn(1, 2);
        game.playTurn(3, 1);
        String message = game.playTurn(1, 3);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInRowTwo_thenWinAndReturnMessage() {
        game.playTurn(2, 1);
        game.playTurn(3, 2);
        game.playTurn(2, 2);
        game.playTurn(1, 1);
        String message = game.playTurn(2, 3);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInRowThree_thenWinAndReturnMessage() {
        game.playTurn(3, 1);
        game.playTurn(1, 2);
        game.playTurn(3, 2);
        game.playTurn(2, 1);
        String message = game.playTurn(3, 3);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerTwoPutsThreeMarksInRowOne_thenWinAndReturnMessage() {
        game.playTurn(2, 1);
        game.playTurn(1, 1);
        game.playTurn(3, 1);
        game.playTurn(1, 2);
        game.playTurn(3, 3);
        String message = game.playTurn(1, 3);
        assertThat(message, is("Jugador 2 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInColOne_thenWinAndReturnMessage() {
        game.playTurn(1, 1);
        game.playTurn(2, 3);
        game.playTurn(2, 1);
        game.playTurn(1, 2);
        String message = game.playTurn(3, 1);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInColTwo_thenWinAndReturnMessage() {
        game.playTurn(1, 2);
        game.playTurn(1, 3);
        game.playTurn(2, 2);
        game.playTurn(3, 1);
        String message = game.playTurn(3, 2);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePutsThreeMarksInColThree_thenWinAndReturnMessage() {
        game.playTurn(1, 3);
        game.playTurn(1, 2);
        game.playTurn(2, 3);
        game.playTurn(3, 1);
        String message = game.playTurn(3, 3);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerTwoPutsThreeMarksInColOne_thenWinAndReturnMessage() {
        game.playTurn(1, 3);
        game.playTurn(1, 1);
        game.playTurn(2, 2);
        game.playTurn(2, 1);
        game.playTurn(3, 2);
        String message = game.playTurn(3, 1);
        assertThat(message, is("Jugador 2 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePuts3MarksDiagonalRight_thenWinAndReturnMessage() {
        game.playTurn(1, 1);
        game.playTurn(2, 1);
        game.playTurn(2, 2);
        game.playTurn(3, 1);
        String message = game.playTurn(3, 3);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerOnePuts3MarksDiagonalLeft_thenWinAndReturnMessage() {
        game.playTurn(1, 3);
        game.playTurn(2, 3);
        game.playTurn(2, 2);
        game.playTurn(1, 1);
        String message = game.playTurn(3, 1);
        assertThat(message, is("Jugador 1 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenPlayerTwoPuts3MarksDiagonalRight_thenWinAndReturnMessage() {
        game.playTurn(1, 2);
        game.playTurn(1, 1);
        game.playTurn(3, 1);
        game.playTurn(2, 2);
        game.playTurn(1, 3);
        String message = game.playTurn(3, 3);
        assertThat(message, is("Jugador 2 GANA!!!"));
    }


    @Test
    public void givenAInitiatedGame_whenBoardIsFull_thenDrawAndReturnMessage() {
        game.playTurn(1, 1);
        game.playTurn(1, 2);
        game.playTurn(1, 3);
        game.playTurn(2, 3);
        game.playTurn(2, 1);
        game.playTurn(3, 1);
        game.playTurn(2, 2);
        game.playTurn(3, 3);
        String message = game.playTurn(3, 2);
        assertThat(message, is("EMPATE!!!"));
    }


    @Test
    public void givenAGameFinish_whenPlayerPutsMark_thenReturnMessage() {
        game.playTurn(1, 1);
        game.playTurn(2, 2);
        game.playTurn(1, 2);
        game.playTurn(3, 1);
        game.playTurn(1, 3);
        String message = game.playTurn(3, 3);
        assertThat(message, is("El juego ha finalizado. Si quiere volver a jugar, inicie de nuevo el juego"));
    }


}
