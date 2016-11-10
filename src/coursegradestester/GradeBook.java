/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursegradestester;

/**
 *
 * @author etwat3497
 */
public class GradeBook {
    //Declare variables
    private int[][] grades;
    private String[] students;
    private int numOfMarks, numOfStud;
    
    public GradeBook(){
        //If no input
        grades = new int[0][0];
        students = new String[0];
        numOfMarks = 0;
        numOfStud = 0;
    }
    
    public GradeBook(int stud, int numMarks){
        //Set base variables
        grades = new int[stud][numMarks];
        students = new String[stud];
        numOfMarks = numMarks;
        numOfStud = stud;
    }
    
    public void setGrades(int markNum, int stud, int mark){
        grades[stud][markNum] = mark;
    }
    
    public void setNames(String name, int i){
        students[i] = name;
    }
    
    public String getNames(int j){
        return(students[j]);
    }
    
    public double studentAvg(int stud){
        double markTotal = 0;
        //Calculate the total marks for an individual student in the 2D array
        for(int i=0;i<numOfMarks;i++){
            markTotal += grades[stud][i];
        }
        //Calculate the average and return it
        markTotal = markTotal/numOfMarks;
        return(markTotal);
    }
    
    public double testAvg(int test){
        double testAverg = 0;
        //Calculate the total marks got on an individual test in the 2D array
        for(int i=0; i<numOfStud;i++){
            testAverg += grades[i][test];
        }
        //Calculate the average of the test and return it
        testAverg = testAverg/numOfStud;
        return(testAverg);
    }
}
