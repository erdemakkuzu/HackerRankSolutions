import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*https://www.hackerrank.com/challenges/grading/problem
* HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
*
* */
public class GradingStudents{
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38)
                resultList.add(grade);
            else if (grade % 5 == 3 || grade % 5 == 4) {
                resultList.add(grade + 5 - (grade % 5));
            } else
                resultList.add(grade);
        }
        return resultList;
    }
}





