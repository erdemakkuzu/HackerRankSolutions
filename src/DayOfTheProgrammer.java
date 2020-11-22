
/*
*https://www.hackerrank.com/challenges/day-of-the-programmer/forum
* Complete the dayOfProgrammer function in the editor below. It should return a string representing the date of the 256th day of the year given.
dayOfProgrammer has the following parameter(s):
year: an integer
*
*
* */

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2016));
    }
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int aproximateDay = 13;
        StringBuilder programmersMonth = new StringBuilder(".09.");
        programmersMonth.append(year);
        if (year <= 1917 && year >= 1700) {
            if (year % 4 == 0) {
                aproximateDay -= 1;
            }
        } else if (year > 1918) {
            if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
                aproximateDay -= 1;
            }
        }else{
            aproximateDay=26;
        }
        return new StringBuilder(String.valueOf(aproximateDay)).append(programmersMonth).toString();
    }
}

