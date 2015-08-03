package chess;

public class ChessBoard {

	String chessboard[][];
	
	final String[] piecesRepresentation = {"R1","N1", "B1", "K ", "Q ", "B2", "N2", "R2"};
	int lengthOfBoard;
	
	ChessBoard(){
		lengthOfBoard = 9;
		chessboard = new String[lengthOfBoard][lengthOfBoard];
		
		for(int i=0; i<lengthOfBoard; i++){
			chessboard[i][1] = "W" + piecesRepresentation[i];
			chessboard[i][8] = "B" + piecesRepresentation[i];
			chessboard[i][1+1] = "W" + "P" + i;
			chessboard[i][8-1] = "B" + "P" + i;
		}
	}
	
	public String[][] getBoard(){
		return chessboard;
	}
	
	public void printBoard(){
		//Printing starts at 1
		for(int i=lengthOfBoard-1; i > 0; i--){
			for(int j=1; j<lengthOfBoard; j++){
				if(chessboard[i][j] != null){
					System.out.print("   ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
