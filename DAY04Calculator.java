public class DAY04Calculator {
    public static void main(String[] args) {
        int sum = add(10, 5);
        int product = multiply(10, 15);
        System.out.println("Result:" + sum);
        System.out.println("Result:" + product);
    }

    public static int add(int a, int b) {
       int sum = a + b;
       return sum;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
}
