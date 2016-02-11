import java.util.HashSet;


public class validSudoku {
	
	public static boolean isValidSudoku(char [][]board){
		int row=board.length;
		int column=board[0].length;
		for(int i=0;i<row;i++){
			char []temp=board[i];
			HashSet set=new HashSet();
			for(char j:temp){
				if(j!='.'){
					if(!set.add(j))
						return false;
				}
			}
		}
		for(int i=0;i<column;i++){
			HashSet temp=new HashSet();
			for(int j=0;j<row;j++){
				if(board[j][i]!='.'){
					if(!temp.add(board[j][i]))
						return false;
				}
			}
		}
		for(int i=0;i<row;i+=3){
			for(int j=0;j<column;j+=3){
				HashSet temp=new HashSet();
				for(int k=0;k<3;k++){
					for(int l=0;l<3;l++){
						if(board[i+k][j+l]!='.'){
							if(!temp.add(board[i+k][j+l]))
								return false;
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []val={"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
		char [][]board= new char[9][9];
		for(int i=0;i<9;i++){
			String temp=val[i];
			for(int j=0;j<9;j++){
				board[i][j]=temp.charAt(j);
			}
		}
		System.out.println(isValidSudoku(board));
	}

}
