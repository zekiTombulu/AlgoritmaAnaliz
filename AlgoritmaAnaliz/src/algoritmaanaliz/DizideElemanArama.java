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

        ElemanBulma();

    }

    public static void ElemanBulma() {

        System.out.println("dizi boyutunu giriniz");
        Scanner diziOlusturma = new Scanner(System.in);
        int boyut = diziOlusturma.nextInt();
        System.out.println("buyuk için '1' e kucuk için '2' ye basınız");
        int buyukKucuk = diziOlusturma.nextInt();
        System.out.println("aranacak indexi giriniz ");
        int index = diziOlusturma.nextInt();

        Random rand = new Random();//Random fonsiyon tanımlandi
        int dizi[] = new int[boyut];//dizi oluşturuldu
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50) + 1;//dizi rastgele elemanlarla dolduruldu(1 ile 50 arasinda)

        }
        System.out.println("sirasiz dizi");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("-" + dizi[i]);;

        }
        System.out.println("");
        int temp;   // Yer değiştirmede kullanılacak geçici değişken
        for (int i = 1; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length - i; j++) {

                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;

                }//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
            }
            // Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
        }
        System.out.println("sirali dizi");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("-" + dizi[i]);;

        }
        System.out.println("");

        if (buyukKucuk == 1) {
            System.out.println("dizinin en büyük  " + index + " inci elemanı " + dizi[dizi.length - index]);

        } else if (buyukKucuk == 2) {
            System.out.println("dizinin en kucuk  " + index + " inci elemanı " + dizi[index]);
        } else {
            System.out.println("yanlis deger girdiniz");
        }

    }
}
