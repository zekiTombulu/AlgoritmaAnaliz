/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanaliz;

import jdk.nashorn.internal.objects.NativeMath;
import java.util.Random;

/**
 *
 * @author zeki
 */
public class maxsubsum_toplam_indis {

    static private int seqStart = 0;
    static private int seqEnd = -1;

    public static int maxsubsum_toplam_indis_fonksiyon(int[] a) {

        int maxSum = 0;
int k;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (k = i; k <= j; k++) {
                    thisSum += a[ k];

                }

                if (thisSum > maxSum) {
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                   
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

       
          Random rand = new Random();
         int dizi[] = new int[10];
         for (int i = 0; i < dizi.length; i++) {
         dizi[i] = rand.nextInt() ;
         }
         for (int i = 0; i < dizi.length; i++) {
         System.out.print(dizi[i] + "  ");
         }
        int maxSum;


        maxSum = maxsubsum_toplam_indis_fonksiyon( dizi );
        
        System.out.println("maxSum = "+maxSum);
        for(int s=seqStart;s<=seqEnd;s++){
            System.out.print("a["+s+"] ");
        }
    }
}
