package Refactoring_ExtractFunction;


public class StudentGrades {
    public void calculateGrades() {
        // Step 1: Get student scores
        int[] scores = {85, 92, 78, 90, 88};

        // Step 2: Calculate total score
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        // Step 3: Calculate average score
        double averageScore = totalScore / (double) scores.length;

        // Step 4: Determine letter grade
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 5: Print results
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        sg.calculateGrades();
    }
}

