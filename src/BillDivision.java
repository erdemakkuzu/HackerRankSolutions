import java.util.List;

/*
*https://www.hackerrank.com/challenges/bon-appetit/problem
*Complete the bonAppetit function in the editor below.
* It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill
*
* */


public class BillDivision {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int annasSum = 0;
        for(int i=0; i<bill.size();i++){
            if(i!=k)
                annasSum+=bill.get(i);
        }
        annasSum/=2;
        System.out.println(b == annasSum ? "Bon Appetit" : b-annasSum);
    }
}
