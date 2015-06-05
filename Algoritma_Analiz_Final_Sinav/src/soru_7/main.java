/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_7;

/**
 *
 * @author zeki
 */
public class main {

    int size;

    public static void main(String[] args) {

        int[] dizi = {1, 3, 5, 6, 7, 8, 9, 10, 12, 23, 56, 66, 67};

        boolean a = Ara(dizi, dizi.length, 67);
        System.out.println(a);
    }

    public static boolean Ara(int[] data, int size, int aranan_sayi) {

        int sol_baslangic = 0;
        int orta_baslangic = data.length / 3;
        int sag_baslangic = orta_baslangic * 2;
        int sag_bitis = size - 1;

        System.out.println("ilk sol  " + sol_baslangic);
        System.out.println("orta bas " + orta_baslangic);
        System.out.println("sağ bas " + sag_baslangic);
        System.out.println("sağ bitis   " + sag_bitis);

        while (orta_baslangic >= sol_baslangic) {
            int test_et = (sol_baslangic + orta_baslangic) / 2;
            if (data[test_et] == aranan_sayi) {
                return true;
            }
            if (data[test_et] < aranan_sayi) {
                sol_baslangic = test_et + 1;
                while (sag_baslangic >= orta_baslangic) {

                    int test_et2 = (orta_baslangic + sag_baslangic) / 2;
                    if (data[test_et] == aranan_sayi) {
                        return true;
                    }
                    orta_baslangic=test_et2+1;
                }
                 while (sag_bitis >= sag_baslangic) {

                    int test_et3 = (sag_bitis + sag_baslangic) / 2;
                    if (data[test_et] == aranan_sayi) {
                        return true;
                    }
                    sag_baslangic=test_et3+1;
                }

            }
            if (data[test_et] > aranan_sayi) {
                orta_baslangic = test_et - 1;

              
                
                while (sag_bitis >= sag_baslangic) {

                    int test_et3 = (sag_bitis + sag_baslangic) / 2;
                    if (data[test_et] == aranan_sayi) {
                        return true;
                    }
                    sag_baslangic=test_et3+1;
                }
            }
        }
        return false;
    }
}
