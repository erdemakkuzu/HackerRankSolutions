
/*
* https://www.hackerrank.com/challenges/apple-and-orange/problem
*Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.
* */
public class AppleAndOrange {

    public static void main(String[] args) {
        int[] apples = {2};
        int[] oranges = {-2};
        countApplesAndOranges(2,3,1,5,apples,oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i < apples.length; i++) {
            int updatedLocation = a + apples[i];
            if (updatedLocation >= s && updatedLocation <= t)
                appleCount++;
        }
        for (int i = 0; i < oranges.length; i++) {
            int updatedLocation = b + oranges[i];
            if (updatedLocation <= t && updatedLocation >= s)
                orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
