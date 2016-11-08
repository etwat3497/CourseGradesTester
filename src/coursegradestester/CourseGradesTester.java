/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursegradestester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class CourseGradesTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numOfMarks, students, markNum, marks;
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are there?");
        students = Integer.parseInt(input.nextLine());
        
        System.out.println("How many marks does each student have?");
        numOfMarks = Integer.parseInt(input.nextLine());
        
        GradeBook obj = new GradeBook(students,numOfMarks);
        
        for(int i = 0;i<students; i++){
            markNum = 0;
            
            for(int j = 0; j<numOfMarks;j++){
                System.out.println("Enter mark "+(markNum+1)); //Add student num
                marks = Integer.parseInt(input.nextLine());
                obj.getGrades(markNum,i,marks);
                markNum++;
            }
        }
        System.out.println("Which student do you want to calculate the average for?");
        int studentNum = Integer.parseInt(input.nextLine());
        double average = obj.studentAvg((studentNum-1));
        System.out.println("Their average is "+average);
        
        System.out.println("Which test would you like to see the average of?");
        int testNum = Integer.parseInt(input.nextLine());
        double testAverage = obj.testAvg((testNum-1));
        System.out.println("The average for the test is "+testAverage);
    }
    
}
