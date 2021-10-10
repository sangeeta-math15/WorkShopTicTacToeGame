
package com.bridge.tictactoe;

/**
 * TicTacToeGame Program
 * 
 * @author Sangeeta Math
 * 
 *
 */
public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();
	}

	/*
	 * Create a board method
	 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' '; // initializing empty spaces to index
		}
		System.out.println("Borad Created");
		return board;
	}

}
