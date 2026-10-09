import java.util.Scanner;

public class DAY01Scanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的年龄:");

        int age = sc.nextInt();

        System.out.println("你的年龄是:" + age);

        sc.close();
    }
}
