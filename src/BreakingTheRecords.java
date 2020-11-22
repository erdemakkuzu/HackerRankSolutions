
/*
* https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
*
* Maria plays college basketball and wants to go pro.
* Each season she maintains a record of her play.
*  She tabulates the number of times she breaks her season record for most points and least points in a game.
* Points scored in the first game establish her record for the season, and she begins counting from there.
*
* For example, assume her scores for the season are represented in the array . Scores are in the same order as the games played. She would tabulate her results as follows:
*
*                                  Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1
Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.
* */
public class BreakingTheRecords {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        int maxPoint = scores[0];
        int minPoint = scores[0];
        for (int score : scores) {
            if (score > maxPoint) {
                maxPoint = score;
                result[0] = result[0] + 1;
            }
            if (score < minPoint) {
                minPoint = score;
                result[1] = result[1] + 1;
            }
        }
        return result;
    }
}
