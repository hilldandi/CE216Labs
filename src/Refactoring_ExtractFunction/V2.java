package Refactoring_ExtractFunction;

public class V2{
    public void calculateGrades() {
        // Step 1: Get student scores
        int[] scores = {85, 92, 78, 90, 88};

        // Step 2: Calculate total score
        int totalScore =calculateTotalScore(scores);

        // Step 3: Calculate average score
        double averageScore = calcAverage(totalScore,scores);

        // Step 4: Determine letter grade  +
        char grade= determineGrade(averageScore);

        // Step 5: Print results   +
        printResults(totalScore,averageScore,grade);
    }

    public static void main(String[] args) {
        V2 sg = new V2();
        sg.calculateGrades();
    }
    public double calcAverage(int totalScore, int[] scores){
        double averageScore=totalScore / (double) scores.length;
        return averageScore;
    }


    private int calculateTotalScore(int[] scores) {

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return totalScore;
    }


    public char determineGrade(double averageScore){

        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return  'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public void printResults(int totalScore,double averageScore,char grade){
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}


