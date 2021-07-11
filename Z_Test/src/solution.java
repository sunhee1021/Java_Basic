
class Solution {
    public int solution(int[][] board, int[] moves) {
    	int answer = 0;
    	int max = 1000;
    	int position;
    	
    	
    for(int i = 0; i < moves.length; i++){
        for(int j = 0; j < board.length; j++){	
        	if(board[j][moves[i]-1] != 0) {
        		//인형을 어떻게 뽑지...
        		board[j][moves[i]-1] = 0; //인형이 뽑히니까 0으로 바꿔주고...
        		if()
        	}else {
        		//인형뽑기 칸이 비어있지....
        		
        	}
        }
    }
    
    
        return answer;
    }
}
