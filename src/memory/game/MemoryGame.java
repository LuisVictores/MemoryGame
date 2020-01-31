/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mlarrubia
 */
public class MemoryGame {
    public static Scanner kb = new Scanner(System.in);
    public static Random random = new Random();
    
    public static void main(String[] args) {
    int gridSize = 4;
    
    char[] deck = {'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};
    boolean[] cardDrawn = new boolean[16];
    
    for(int i = 0; i < 16; i++){
        cardDrawn[i] = false;
    }
    
    char[][] grid = new char[4][4];
    int randCard;
    
    for(int r = 0; r < gridSize; r++){
        for(int c = 0; c < gridSize; c++){
            randCard = random.nextInt(16);
            while(cardDrawn[randCard]){
                
            }
        }
    }
    
        
    }
    
}
