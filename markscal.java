import java.util.Scanner;

public class markscal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = sc.nextInt();
        
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        for(int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + (i+1) + ":");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        
        double percentage = (double)totalMarks / numberOfSubjects;
        char grade;
        

        switch ((int)percentage / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
