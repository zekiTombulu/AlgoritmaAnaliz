/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru_6;

import java.util.*;

/**
 *
 * @author zeki
 */

//Karmasıklık O(n);
public class Main {

    public static void main(String[] args) {

        int[] dizi = {1,0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0};

        int boyut = dizi.length;
        System.out.println("boyut= " + boyut);
        int sifir_baslangic = -1;
        int sifir_bitis = -1;

        List<DiziBilgi> yeniListe = new ArrayList<DiziBilgi>();

        for (int i = 0; i < boyut; i++) {
            if (dizi[i] == 0) {
                if (sifir_baslangic == -1) {
                    sifir_baslangic = i;

                }

            }
            if (dizi[i] == 1) {
                if (sifir_baslangic != -1) {
                    sifir_bitis = i;
                    DiziBilgi b1 = new DiziBilgi();

                    b1.setBaslangic(sifir_baslangic);
                    b1.setBitis(sifir_bitis);
                    b1.setBoyut(sifir_bitis - sifir_baslangic);
                    yeniListe.add(b1);

                    sifir_baslangic = -1;
                    sifir_bitis = -1;

                }
            }

        }

        int max_boyut = 0;
        int max_boyut_indis = 0;
        for (int i = 0; i < yeniListe.size(); i++) {
            DiziBilgi b2 = new DiziBilgi();
            b2 = yeniListe.get(i);
            //System.out.println(b2.boyut);
            if (b2.boyut > max_boyut) {
                max_boyut = b2.boyut;
                max_boyut_indis = i;

            }

        }
        DiziBilgi b2 = new DiziBilgi();
        b2 = yeniListe.get(max_boyut_indis);
        System.out.println("max boyutlu dizinin başlangic indisi  "+b2.getBaslangic());
        System.out.println("max boyutlu dizinin bitiş indisi  "+b2.getBitis());
        System.out.println("max boyutlu dizinin boyutu  "+b2.getBoyut());

    }

}
