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
    private int[][] grades;
    private int numOfMarks, numOfStud;
    
    public GradeBook(){
        grades = new int[0][0];
    }
    
    public GradeBook(int stud, int numMarks){
        grades = new int[stud][numMarks];
        numOfMarks = numMarks;
        numOfStud = stud;
    }
    
    public void getGrades(int markNum, int stud, int mark){
        grades[stud][markNum] = mark;
    }
    
    public double studentAvg(int stud){
        double markTotal = 0;
        for(int i=0;i<numOfMarks;i++){
            markTotal += grades[stud][i];
        }
        markTotal = markTotal/numOfMarks;
        return(markTotal);
    }
    
    public double testAvg(int test){
        double testAverg = 0;
        for(int i=0; i<numOfStud;i++){
            testAverg += grades[i][test];
        }
        testAverg = testAverg/numOfStud;
        return(testAverg);
    }
}
