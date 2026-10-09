import java.util.Scanner;

public class DAY01Score {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生成绩:");
        int score = sc.nextInt();

        if (score < 0 || score > 100){
            System.out.println("成绩无效");
        }else if (score >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        sc.close();
    }
}
