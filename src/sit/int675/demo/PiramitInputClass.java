/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.util.Scanner;

/**
 *
 * @author chaiyapong
 */
public class PiramitInputClass {
    
    public static void main(String[] args) {
        initPiramit();
    }

    private static void initPiramit() {
        
        System.out.println("Please input within out format");
        System.out.println("Charactor, Number");
        
        Scanner sc = new Scanner(System.in);
        while (true) {
//            Object nextElement = en.nextElement();
            try{
            String[] inputText = sc.next().split(",");
            String text = inputText[0];
            int inputInteger = Integer.valueOf(inputText[1]);
            inputInteger = (inputInteger*2)+1;
            
                for (int i = 0; i < inputInteger; i++) {
                    for (int j = 0; j < inputInteger; j++) {
                        System.out.print(text);
                    }
                    System.out.println();
                   inputInteger--; 
                    
                }
        }catch(Exception e){
            e.printStackTrace();
            
        }
        }
        
    }
}
