//experiment 2 (c)

package labEx;
import java.util.Arrays;

public class Studentgrade2c {
    public static void main(String[] args) {
        int[] marks = new int[10];
        String[] grades = new String[10];

        // Accepting student marks
        System.out.println("Enter 10 student marks:");
        for (int i = 0; i < 10; i++) {
            marks[i] = Integer.parseInt(System.console().readLine());
        }

        // Sorting marks in ascending order
        Arrays.sort(marks);

        // Converting marks into grades
        for (int i = 0; i < 10; i++) {
            int mark = marks[i];
            if (mark >= 40 && mark <= 50) {
                grades[i] = "PASS";
            } else if (mark >= 51 && mark <= 75) {
                grades[i] = "MERIT";
            } else {
                grades[i] = "DISTINCTION";
            }
        }

        // Printing marks and grades in tabular form
        System.out.println("Marks\tGrade");
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i] + "\t" + grades[i]);
        }
    }
}