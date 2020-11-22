import java.util.ArrayList;
import java.util.List;

/*
* https://www.hackerrank.com/challenges/the-birthday-bar/problem
* Given a chocolate bar, two children, Lily and Ron, are determining how to share it. Each of the squares has an integer on it.
Lily decides to share a contiguous segment of the bar selected such that:
The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
You must determine how many ways she can divide the chocolate.
* */
public class SubArrayDivision {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        System.out.println(birthday(list,4,1));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int possibilities = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d)
                possibilities++;
            sum = 0;
        }
        return possibilities;
    }
}
