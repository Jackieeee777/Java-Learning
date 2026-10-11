public class DAY03ScoresStatistics {
    public static void main(String[] args){
        int[] scores = {85, 92, 76, 88, 95};
        int sum = 0;
        for (int i = 0;i < scores.length; i++) {
            sum = sum +scores[i];
        }
        System.out.println("Total Score:" + sum);

        double average = (double) sum / scores.length;
        System.out.println("Average Score:" + average);

        int max = scores[0];
        for (int i = 1; i < scores.length; i++){
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("Highest Score:" + max);
    }
}
