/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valoresint;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class ValoresInt {

   
    public static void main(String[] args) {
   
        Scanner ler = new Scanner(System.in);
        
        int a,b;
        System.out.println("leia a");
        a=ler.nextInt();
        System.out.println("Leia b");
        b=ler.nextInt();
        if (a==b){
            System.out.println("A soma é"+ a+b);
        }else{
            System.out.println("A multiplicação é"+ a*b);
            
            
        }
        
        
        
        
        
    }
    
}
