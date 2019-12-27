import java.util.Scanner;

public class z_test {

    public static void main(String[] args) {
        System.out.println("text.txt:");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();
        String s4 = s.nextLine();
        System.out.println("keyword.lst:");
        String x1 = s.nextLine();
        String x2 = s.nextLine();
        String x3 = s.nextLine();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        if (s1.indexOf(x1) != -1) {
            count1 += 1;

        }
        if (s1.indexOf(x2) != -1) {
            count2 += 1;
        }
        System.out.println("文本详情:");
    }

}