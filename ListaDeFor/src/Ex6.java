/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero para saber o numeros primos acima "
                + "de 1 ate o numero digitado");
        int val = scn.nextInt();
        for(int i = 2 ;i <= val; i++ ){
            int nPrimo = 0;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                 nPrimo++;
                 break;
                }
            }
            if(nPrimo < 1){
                System.out.println("O numero "+i+" é primo");
            }
           
        }
        
    }
}
