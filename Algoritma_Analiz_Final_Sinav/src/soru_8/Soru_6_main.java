/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soru_8;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author zeki
 */
public class Soru_6_main {

    /**
     * @param args the command line arguments
     */
    
    
    //Karmasıklık O(n);
    
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("dizi kac boyutlu olsun :");
        Scanner klavye = new Scanner (System.in);
        int boyut=klavye.nextInt();
        int [] dizi=new int[boyut];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rand.nextInt(50);
            
        }
         System.out.println("dizinin tersten yazilmis hali");
        for (int i = dizi.length; i >0; i--) {
           
            System.out.print("//"+dizi[i-1]);
            
        }
        
    }
    
}
