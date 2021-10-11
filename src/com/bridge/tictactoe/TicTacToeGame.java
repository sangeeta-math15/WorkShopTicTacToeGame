
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
			computer = 'O';
		} else {
			computer = 'X';
		}
		System.out.println("Computer Letter is=>" + computer + " " + "Player letter is=>" + player);
		showBoard(board);
		desiredIndexMove(board);
	}

	private static void showBoard(char[] board) {
		System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("------------");
		System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("------------");
		System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9]);

	}

	private static char ChooseLetter() {
		System.out.println("Choose letters for Player and computer");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter For Player(X/O)");
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

	public static void desiredIndexMove(char board[])// placing move to desired index
	{
		int index;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Index numbe to select the number between 1 to 9 :");
		index = input.nextInt();
		if (index > 0 && index < 10 && board[index] == ' ') {
			System.out.println(index + " Index is empty");
		} else {
			System.out.print("Re enter the valid index");
		}

	}

}
