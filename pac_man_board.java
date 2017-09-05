package for_testing_only;

import java.awt.*;
import javax.swing.*;

public class pac_man_board{
    
    int height = 500 , width = 500, factor = 5;
    String brick = "" + (char)248;
    boolean[][] board = new boolean[height/factor + 1][width/factor + 1];
    
    pac_man_board(pac_man pm){
        height = pm.height;
        width = pm.width;
        //factor = pm.factor;
        design();
    }
    
    boolean[][] getBoard(){
        return board;
    }
    
    void design(){
        //only design first quarter part 
        //rest are the mirrors of this
        
        int x = 70/factor , y = 0;
        for(int i=y ; i<30/factor ; i++){
            board[x][i] = true;
            board[x + 1][i] = true;
        }
        
        x = 250/factor - 1;
        y = 20/factor;
        for(int i=y ; i<(80/factor + 2) ; i++){
            board[x][i] = true;
        }
        x -= 30/factor;
        y = 50/factor;
        for(int i=x ; i<=x + (30/factor) ; i++){
            board[i][y] = true;
            board[i][y + 1] = true;
        }
        
        x = 0;
        y = 190/factor;
        for(int i=x ; i<30/factor ; i++){
            board[i][y] = true;
            board[i][y+1] = true;
        }
        
        x = 160/factor;
        y = 230/factor;
        for(int i=y ; i<(height/2)/factor ; i++){
            board[x][i] = true;
            board[x + 1][i] = true;
        }
        
        x = 180/factor;
        y = 200/factor - 2;
        for(int i=x ; i<(x + 30/factor) ; i++){
            board[i][y] = true;
            board[i][y+1] = true;
        }
        
        x = 50/factor;
        y = 70/factor;
        for(int i=x ; i<130/factor ; i++){
            board[i][y] = true;
            board[i][y+1] = true;
        }
        x = 130/factor - 2;
        y = 70/factor + 2;
        for(int i=y ; i<(y + 40/factor) ; i++){
            board[x][i] = true;
            board[x + 1][i] = true;
        }
        
        mirror();
        
    }
    
    void mirror(){
        int a = (height/2)/factor , b = (width/2)/factor;
        for(int i=0 ; i<=a ; i++){
            for(int j=0 ; j<=b ; j++){
                if(board[i][j]){
                    board[width/factor - i][j] = true;
                    board[width/factor - i][height/factor - j] = true;
                    board[i][height/factor - j] = true;
                }
            }
        }
    }
}
