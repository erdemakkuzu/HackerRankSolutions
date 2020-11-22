import java.util.ArrayList;
import java.util.List;

/*https://www.hackerrank.com/challenges/migratory-birds/problem
* You have been asked to help study the population of birds migrating across the continent.
*  Each type of bird you are interested in will be identified by an integer value.
* Each time a particular kind of bird is spotted, its id number will be added to your array of sightings.
*  You would like to be able to find out which type of bird is most common given a list of sightings.
* Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.
*
* */

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBird(arr));
    }


    // Complete the migratoryBirds function below.
    static int migratoryBird(List<Integer> arr) {
        int[] freqArray = new int[6];
        int maxIndex = 0;
        int maxRepeat=0;
        for(int i=0; i<arr.size();i++){
            freqArray[arr.get(i)]++;
        }
        for(int i=1;i<freqArray.length;i++){
            if(freqArray[i]>maxRepeat){
                maxRepeat=freqArray[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
