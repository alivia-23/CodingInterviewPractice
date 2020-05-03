/*
Q5
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
*/

public class WordSearch {
	 public boolean exist(char[][] board, String word) {
     // iterate through all the rows and for every rows iterate through the column
		  for(int i = 0; i < board.length; i++){
		      for(int j = 0; j < board[i].length; j++){
		   
     /* if cell contains our first letter of the word then call dfs funtion and pass our board
		        row, column, number of letters found and the word that we are searching for*/
		           if(board[i][j] == word.charAt(0) &&
		              dfs(board, i, j, 0, word)){
		                  return true;  
		              }
		       }         
		   }
		   return false;
	  }
		     
	  public boolean dfs(char[][] board, int i, int j, int count, String word){
	  // first exit condition is number of letters found doesn't match with given word
		   if(count == word.length()){
		       return true;
		   }
      // second exit condition boundary checking of rows and columns
		   if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || 
		      board[i][j] != word.charAt(count)){
		       return false;
		   }
      /*since same letter cannot be used more than once so make the cell as empty by saving 
		     each cell value in a temp variable*/
		   char temp = board[i][j];
		   board[i][j] = ' ';
      // recurse if we can move to any other cell to find our given word
		   boolean exist = dfs(board, i+1, j, count + 1, word) || 
		                   dfs(board, i-1, j, count +1, word) || 
		                   dfs(board, i, j+1, count +1, word) || 
		                   dfs(board, i, j-1, count+ 1, word);
      // restore our previous vale from temp to board
		   board[i][j] = temp;
	       return exist;
		        
	  }

}
