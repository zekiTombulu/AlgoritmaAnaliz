/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmaanaliz;

import java.util.Random;

/**
 *
 * @author zeki
 */
public class DizideEnBuyukEleman {
   public static void main(String[] args) {

        Random rand = new Random();//Random fonsiyon tanımlandi
        int dizidekiElemanSayisi = rand.nextInt(20) + 1;//dizideki eleman sayisi belirlendi(1 ile 20 arasinda)
        int dizi[] = new int[dizidekiElemanSayisi];//dizi oluşturuldu
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50) + 1;//dizi rastgele elemanlarla dolduruldu(1 ile 50 arasinda)

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "-");//dizi ekrana yazdırıldı
        }
        System.out.println("");
        maxElemanBul(dizi);
    }
    
    public static void maxElemanBul(int A[]){
        try {
            int eleman1=0,eleman2=0;
            for (int i = 0; i < 10; i++) {
                eleman1=A[i];
                if(eleman1>eleman2){
                    eleman2=eleman1;
                }
            }
            System.out.println("en buyuk eleman : "+eleman2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    } 
}
