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
        
        //Declare variables
        int numOfMarks, students, markNum, marks, counter = 0;
        String studentName;
        Scanner input = new Scanner(System.in);
        
        //Get user input for the number of students
        System.out.println("How many students are there?");
        students = Integer.parseInt(input.nextLine());
        
        //Get user input for the number of tests
        System.out.println("How many tests did each user write?");
        numOfMarks = Integer.parseInt(input.nextLine());
        
        //Create a new gradebook object
        GradeBook obj = new GradeBook(students,numOfMarks);
        
        //For loop for the number of students
        for(int i = 0;i<students; i++){
            //Get each students name and set the name in the gradebook class
            markNum = 0;
            System.out.println("What is the students name?");
            studentName = input.nextLine();
            obj.setNames(studentName,i);
            
            //For loop the size of the number of marks
            for(int j = 0; j<numOfMarks;j++){
                //Get user input for the marks and set these marks in the gradebook class
                System.out.println("Enter the mark achieved on "+(markNum+1)+" for "+obj.getNames(counter)); //Add student num
                marks = Integer.parseInt(input.nextLine());
                obj.setGrades(markNum,i,marks);
                markNum++;
            }
            counter++;
        }
        
        //Calculate the average of an individual student
        System.out.println("Which student do you want to calculate the average for?");
        int studentNum = Integer.parseInt(input.nextLine());
        //Run the student average method in the gradebook class
        double average = obj.studentAvg((studentNum-1));
        System.out.println("Their average is "+average);
        
        //Calculate the average of a test
        System.out.println("Which test would you like to see the average of?");
        int testNum = Integer.parseInt(input.nextLine());
        //Run the test average method in the gradebook class
        double testAverage = obj.testAvg((testNum-1));
        System.out.println("The average for the test is "+testAverage);
    }
    
}
