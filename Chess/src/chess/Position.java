package chess;

public class Position {
	
	int file;
	String rank;
	
	Position(){
		file= 0;
		rank="";
	}
	Position(int file, String rank){
		this.file = file;
		this.rank= rank;
	}
}
