import java.util.Arrays;
import java.util.Scanner;

public class test {
/*    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        if (n < 2) {
            System.out.println(1);
            return;
        }
        for (int i = 2; i <= n; i++) {
            if (count(i)) {
                ++result;
            }
        }
        System.out.println(result);
    }

    public static boolean count(int n) {
        boolean flag = true;
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                flag = false;
            }
        }

        return flag;
    }*/
/*        public static String sout (String a, String b){
            String[] x = new String();

        }*/


    public static void main(String[] args) {
        int[] a = {0, 3, 4, 6, 9, 12};
        int[] b = {1, 2, 5, 7, 8, 10, 11};
        int[] c = marge(a, b);
        System.out.println(Arrays.toString(c));
    }

    private static int[] marge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        int index = 0;
        //比较指针i,j指向的值，小的值存入指针index指向的结果数组中，当有一个指针（i或j）先到达数组末尾时，比较结束；
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[index++] = a[i++];
            } else {
                c[index++] = b[j++];
            }
        }
        int l;
        //将指针（i或j）没有到达数组末尾的数组复制到指针index指向的结果数组中
        if (i < a.length) {
            for (l = i; l < a.length; l++) {
                c[index++] = a[l];
            }
        }
        //将指针（i或j）没有到达数组末尾的数组复制到指针index指向的结果数组中
        if (j < b.length) {
            for (l = j; l < b.length; l++) {
                c[index++] = b[l];
            }
        }
        return c;
    }
}
