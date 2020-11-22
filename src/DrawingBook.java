/*
* https://www.hackerrank.com/challenges/drawing-book/problem?h_r=next-challenge&h_v=zen
*
*Function Description

Complete the pageCount function in the editor below.

pageCount has the following parameter(s):

int n: the number of pages in the book
int p: the page number to turn to
Returns

int: the minimum number of pages to turn
*
* */

public class DrawingBook {
    static int pageCount(int n, int p) {
        int totalTurnNumbersForWholeBook = n/2;
        int fromFrontTurnNumber = p/2;
        int fromBackTurnNumber = totalTurnNumbersForWholeBook-fromFrontTurnNumber;
        return Math.min(fromBackTurnNumber,fromFrontTurnNumber);
    }
}
