/**
 * Created by Mayank on 9/25/16.
 */
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class DerivedTest2 {

    public static int foo(int[] array, int k) {
        HashSet<Integer> myset = new HashSet<>();
        Arrays.sort(array);
        for(int i : array){
            myset.add(i);
        }


        int[] result = new int[myset.size()];
        int value=0;
        for(int j : myset){
            result[value++]=j;
        }

        return result[result.length-k];

    }


    public static void main(String args[]) {
       int[] array = {3,3,4,4,5,8,9,10,11,2,4};
        System.out.println(foo(array,4));
    }
}