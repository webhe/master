import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
        String a="abc";
        String b=new String("abc");
        String d=new String("abc");
        String c ="a"+"bc";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);
        System.out.println(d==b);
    }
    public static int count(int n){
        if (n==0||n==1){
            return 1;
        }
        int[] x=new int[n];
        int res =n-2;
        x[0]=1;
        x[1]=1;
        for (int i=2;i<n;i++) {
            if (x[i] == 0) {
                for (int j = 2; i * j < n; j++) {
                    if (x[i * j] != 1) {
                        x[i * j] = 1;
                        res--;
                    }

                }
            }
        }
        return res;
    }
}
