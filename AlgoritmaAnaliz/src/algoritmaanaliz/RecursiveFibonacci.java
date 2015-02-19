/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanaliz;

/**
 *
 * @author zeki
 */
public class RecursiveFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int elemanlarinSirasi[] = {10, 20, 30, 40, 50, 60, 70};
        long uretilenElemanlar[] = new long[7];
        long gecenSure[] = new long[7];

        for (int i = 0; i < elemanlarinSirasi.length; i++) {
            long startTime = System.currentTimeMillis();
            uretilenElemanlar[i] = fib(elemanlarinSirasi[i]);
            long endTime = System.currentTimeMillis();
            gecenSure[i] = endTime - startTime;

            System.out.println(elemanlarinSirasi[i] + " inci eleman = " + uretilenElemanlar[i] + " elemanın uretim suresi  " + gecenSure[i]);
        }

    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
