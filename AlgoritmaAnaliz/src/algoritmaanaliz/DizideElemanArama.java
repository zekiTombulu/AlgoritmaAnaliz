/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanaliz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zeki
 */
public class DizideElemanArama {

    public static void main(String[] args) {

        try {
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
            ElemanBulma(dizi);
        } catch (Exception e) {
            System.out.println("dizide aranan indekste eleman bulunamadi");
        }
    }

    public static void ElemanBulma(int A[]) {

        System.out.println("bulmak istediğiniz eleman indeksini giriniz :");
        Scanner aranacakElemanNo = new Scanner(System.in); //Scanner nesnesi ile aranak eleman indexi kalvyeden alindi
        System.out.println("aranan indeksteki eleman :" + A[aranacakElemanNo.nextInt()]);//aranan elaman ekrana yazıldı

    }
}
