/*Write a code to build a student management system that stores 
marks of 5 students. Calculate and print the average. Use Collections. */
import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        
        // Adding marks of 5 students
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = sum / (double) marks.size();
        
        System.out.println("Marks: " + marks);
        System.out.println("Average: " + average);
    }
}
