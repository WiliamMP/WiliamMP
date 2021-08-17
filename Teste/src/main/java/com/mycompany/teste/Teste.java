package com.mycompany.teste;

/**
 *
 * @author wilia
 */
import java.util.Scanner;
public class Teste {
    
    public static void main(String[] args) {
        int alv = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor alvo: ");
        alv = sc.nextInt();
        
        int[] num = new int[4];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite um valor da lita: ");
        num[0] = sc1.nextInt();
        
        String verifica = " ";
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Deseja continuar (Y/N)? ");
        verifica = sc2.nextLine();
        
        int j = 0;
        while("Y".equals(verifica)){
        j++;
        System.out.println("Digite um valor da lita: ");
        num[j] = sc1.nextInt();
        
        System.out.println("Deseja continuar (Y/N)? ");
        verifica = sc2.nextLine();
            }
        for(int i=0;i<num.length;i++) {
            for(int z=0;z<num.length;z++){
               if(num[i] + num[z] == alv) {

                int x = num[i] + num[z];
                System.out.println(num[i] + " + " + num[z] +  " = " + x);
               }
            }
        }
            
        
        
}
}
