package Backtracking;
//this que adk in  3 ways
//1 print all possible soln"just increment the cnt varaible before printting soln
//2print number of soln
//3 print if soln id possible or not boolean and return 1 way only
// 3->make nQueen funtion boolean, 
public class NQueens {
    public static void printBoard(char board[][]){
        System.out.println("-----XX-----");
        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //upside vertically
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upside diagonally right
        for(int i = row-1,j = col-1;i>=0 && j>=0;i--,j--){
           if(board[i][j] =='Q'){
            return false;
           }
        }

        //upside diagonally left
         for(int i = row-1,j = col+1;i>=0 && j<board.length;i--,j++){
           if(board[i][j] =='Q'){
            return false;
           }
        }

        return true;
    }
    public static boolean nQueens(char board[][],int row){
        //base
       if(row == board.length){
         cnt++;
        printBoard(board);
        return true;
       }
        //recursion
        for(int j =0;j<board.length;j++){
            if(isSafe(board,row,j)){
              board[row][j] = 'Q';
              // 3-> just remove if condition and return to print all soln
             if(nQueens(board, row+1)){
                return true;
             }
            }
           
           board[row][j] = '.';
        }
        //3
        return false;
    }
    static int cnt = 0;
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        nQueens(board, 0);

        System.out.println(cnt);
    }
}
