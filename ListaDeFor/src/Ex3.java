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
public class Ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int result = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero");
            result += scn.nextInt();
        }
        System.out.println("A soma de todos os numeros digitados é: "+result);
    }
}
