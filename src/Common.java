import java.util.*;

/**
 * Created by Mayank on 9/9/16.
 */
public class Common {

    public static void mostCommon(int []array) {
        LinkedList<Integer> list = new LinkedList<>();
        int i=0;
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : array) {
            if(map.containsKey(a)) {
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }

        max = Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        int[] result = new int[list.size()];
        int k = 0 ;
        for (int s : list){
            result[k++]=s;
        }

        for (int a:result) {
            System.out.println(a);

        }

    }

    boolean unique(String word){

        boolean[] set = new boolean[256];
        for (int i=0;i<word.length();i++){
            int val=word.charAt(i);
            if(set[val]){
                return false;
            }
            set[val]=true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {3,4,4,4,5,6,10};
        mostCommon(array);

    }
}
