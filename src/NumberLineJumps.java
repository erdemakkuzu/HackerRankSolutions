/**
 *https://www.hackerrank.com/challenges/kangaroo/problem
 *You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
 * The first kangaroo starts at location  and moves at a rate of  meters per jump.
 * The second kangaroo starts at location  and moves at a rate of  meters per jump.
 * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
 *
 */
public class NumberLineJumps {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        if(v2>v1 || v2 ==v1 )
            return  result;

        if((x2-x1) % (v1-v2) == 0){
            result =  "Yes";
        }
        return result;
    }
}
