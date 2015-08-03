package chess;

public class Move {
	
	private int currentPlayer;
	private int numberOfMoves;
	public ChessBoard chessboard;
	private String piece;
	
	Move(){
		currentPlayer = 0;
		numberOfMoves = 2;
		chessboard = new ChessBoard();
		piece = "";
	}

	public void decodeMove(String moves){
		
		String[] twoMoves = moves.split(" ");
		
		for(int i=0; i<numberOfMoves; i++){
			
			currentPlayer = i;
			//Leave the last two characters out
			String thisMove = twoMoves[i];
			
			int rank = thisMove.charAt(thisMove.length()-1) - '0' + 1;
			String file = Character.toString(thisMove.charAt(thisMove.length()-2));
			
			Position oldPosition = new Position();
			Position newPosition = new Position();
			
			//for(int j=0; j<thisMove.length()-2; j++){
				if(Character.isUpperCase(thisMove.charAt(0))){
					//Piece move
					piece = Character.toString(thisMove.charAt(0));
				}
				else{
					//Pawn move
					piece = "P";
					oldPosition.file = thisMove.charAt(0);
				}
			//}
			
			chessboard.changePosition(currentPlayer, piece, oldPosition, new Position(rank, file));
		}
	}
}
