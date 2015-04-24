/*





 Yukarıdan aşağı yinelemeli, yerinde metodu
 Time complexity: best: O(nlogn), average: O(nlogn), worst: O(n^2)
 Space complexity: O(logn), yerinde bölümleme metodu
 Stability: stabil degil yerinde bölümleme metodu
 islemler: findPivot, partition, and recursively call sort on left and the right part of the pivot
 Pivot choice: the median of first, middle, and last element in the array
 */
package algoritmaanaliz;

import java.util.Random;

/**
 *
 * @author zeki
 */
public class QuickSort {

    private static int degistirme = 0;
    private static int[] a;
    private static int pivotIndex;

    public static void sort(int[] aTemp) {
        a = aTemp;
        sort(0, a.length - 1);
    }

    public static void sort(int left, int right) {
       
        
        if (left < right) {
            findPivot(left, right);
            partition(left, right);
            if (left < pivotIndex) {
                sort(left, pivotIndex - 1);
degistirme++;
            }
            if (pivotIndex < right) {
                sort(pivotIndex + 1, right);
degistirme++;
            }
        }

    }

    private static void findPivot(int left, int right) {
        int median = left;
        int mid = left + (right - left) / 2;

        if (a[median] < a[mid]) {
            if (a[mid] < a[right]) {
                median = mid;
            } else if (a[median] < a[right]) {
                median = right;
            }
        } else {
            if (a[right] < a[mid]) {
                median = mid;
            } else if (a[right] < a[median]) {
                median = right;
            }
        }
        pivotIndex = median;
    }

    private static void partition(int left, int right) {
        int i = left;
        int pivotValue = a[pivotIndex];
        int storeIndex = left;

        swap(right, pivotIndex);
        while (i < right) {
            if (a[i] < pivotValue) {
                swap(i, storeIndex);
                storeIndex++;
            }
            i++;
        }
        swap(storeIndex, right);
        pivotIndex = storeIndex;
    }

    private static void swap(int x, int y) {
        int temp;
        degistirme++;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void print(int[] aTemp) {
        for (int i = 0; i < aTemp.length; i++) {
            System.out.print(aTemp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] a = {5, 4, 1, 3, 2};
        Random rand = new Random();//Random fonsiyon tanımlandi
        int a[] = new int[10000];//dizi oluşturuldu
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(5000) + 1;//dizi rastgele elemanlarla dolduruldu(1 ile 50 arasinda)

        }
        print(a);
        sort(a);
        print(a);

        System.out.println("degistirme sayisi = " + degistirme);
    }
}
