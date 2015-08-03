package chess;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = "d4 d5";
		//System.out.println("The move is : " +str );
		input.close();
		
		//ChessBoard cb = new ChessBoard();
		//cb.printBoard();
		
		Move move = new Move();
		move.chessboard.printBoard();
		move.decodeMove(str);
		move.chessboard.printBoard();
	}
}
