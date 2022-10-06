import java.util.ArrayList;
import java.util.List;

class NQueen {
	public List<List<String>> solveNQueens(int n) {
        char[][] chess=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList<>();
        helper(chess,0,res);
        return res;
    }
    
    public void helper(char[][] chess,int row,List<List<String>> res){
        if(row ==chess.length){
            add(chess,res);
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            if(isItSafeToPlaceQueen(chess,row,col)==true){
                chess[row][col]='Q';
                helper(chess,row+1,res);
                chess[row][col]='.';
            }
        }
    }
    
    public boolean isItSafeToPlaceQueen(char[][] chess, int row, int col) {
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public void add(char[][] chess,List<List<String>> res){
        List<String> temp =new ArrayList<>();
        for(int i=0;i<chess.length;i++){
            StringBuilder str=new StringBuilder();
            for(int j=0;j<chess.length;j++){
                str.append(chess[i][j]);
            }
            temp.add(str.toString());
        }
       res.add(temp);
    }


	
}