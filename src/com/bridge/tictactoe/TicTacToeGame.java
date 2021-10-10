
package com.bridge.tictactoe;

import java.util.Scanner;

/**
 * TicTacToeGame Program
 * 
 * @author Sangeeta Math
 * 
 */
public class TicTacToeGame {

	private static char player;
	private static char computer;

	public static void main(String[] args) {
		char[] board = createBoard();
		player = ChooseLetter();
		if (player == 'X') {
			computer = '0';
		} else {
			computer = 'X';
		}
		System.out.println("Computer Letter is=>" + computer + " " + "Player letter is=>" + player);

	}

	private static char ChooseLetter() {
		System.out.println("Choose letters for Player and computer");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter For Player(X/0)");
		player = sc.next().charAt(0);
		return player;
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
