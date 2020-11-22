/*
*https://www.hackerrank.com/challenges/electronics-shop/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
*
* */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPossibleCost = -1;
        for(int i=0; i<keyboards.length;i++){
            for(int j=0;j<drives.length;j++){
                if(keyboards[i]+drives[j]>maxPossibleCost && keyboards[i]+ drives[j]<=b)
                    maxPossibleCost=keyboards[i]+drives[j];
            }
        }
        return maxPossibleCost;
    }
}
