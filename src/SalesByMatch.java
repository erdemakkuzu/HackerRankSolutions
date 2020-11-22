import java.util.HashMap;
import java.util.Map;

/*
*https://www.hackerrank.com/challenges/sock-merchant/problem
*Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale.
* Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
*
* */
public class SalesByMatch {
    public static void main(String[] args) {
        int[] ar = {1, 1, 2, 3, 3, 2, 1};
        System.out.println(sockMerchant(0, ar));
    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairCount = 0;
        Map<Integer, Integer> frequencyHashmap = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (!frequencyHashmap.containsKey(ar[i])) {
                frequencyHashmap.put(ar[i], 1);
            } else {
                frequencyHashmap.put(ar[i], frequencyHashmap.get(ar[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyHashmap.entrySet()) {
            pairCount += entry.getValue() / 2;
        }
        return pairCount;
    }
}
