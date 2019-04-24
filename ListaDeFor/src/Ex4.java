/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael.fnarbutis
 */
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero para saber seus divisores");
        int val = scn.nextInt();
        for(int i = 1; i <= val; i++){
        if(val % i == 0){
            System.out.println("E divisivel por: "+i);
        }
        }
    }
}
