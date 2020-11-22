
/*
*https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
*Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.

divisibleSumPairs has the following parameter(s):

n: the integer length of array
ar: an array of integers
k: the integer to divide the pair sum by
* */


public class DivisibleSumPairs {


    public static void main(String[] args) {
        int[] array = {1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(0,3,array));
    }
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairCounts=0;
        for(int i=0; i<ar.length;i++){
            for(int j =i+1; j<ar.length; j++){
                if((ar[i]+ar[j]) % k ==0)
                    pairCounts++;
            }
        }
        return pairCounts;
    }

}
