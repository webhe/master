import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
/*    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        System.out.println(compare(a,b));
    }
    public static  String compare(String a,String b){
        int inx[]=new int[1000];
        for (int i=0;i<a.length();i++){
            inx[a.charAt(i)-'a']++;
        }
        for (int i=0;i<b.length();i++){
            inx[b.charAt(i)-'a']--;
            if (inx[b.charAt(i)-'a']<0) {
                return "no";
            }
        }
        return "yes";
    }*/

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        List<Integer> list=new ArrayList();
       while(s.nextInt()!=0) {
           int i = s.nextInt();
           list.add(i);
       }
       int count=0;
        for(int i=0;i<list.size();i++){
            while (true){
                int j=1;
                if (!isPrimeNumber(j)|| j%5 !=0 ){
                    count++;
                }
                j++;
                if (count==list.get(i)){
                    System.out.println(j);
                }
            }
        }
    }

    public static boolean isPrimeNumber(Integer num){
        if(num == 2) return true;
        if(num < 2 || num % 2 == 0)
            return false;
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){           
                return false;
            }
        }
        return true;
    }
}
