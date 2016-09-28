/**
 * Created by Mayank on 9/25/16.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DerivedTest2 {

    public void countMaxOccurrence(String[] words){
        HashMap<String,Integer> map = new HashMap<>();
        for (String s:words) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        int high = Integer.MIN_VALUE;
        for (int mvalue:map.values()){
            if(mvalue>high){
                high=mvalue;
            }
        }
        System.out.println(high);
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==high){
                System.out.println(entry.getKey());
            }
        }




    }




    public static void main(String args[]) {
        DerivedTest2 demo1 = new DerivedTest2();

        try( Scanner sc = new Scanner(new FileReader("/Users/Mayank/IdeaProjects/Gnop/src/random.txt"))) {

            ArrayList<String> list = new ArrayList<>();
            while (sc.hasNext()) {
                list.add(sc.next());
            }

           String[] result = new String[list.size()];
            int value=0;
            for (String s: list) {
                result[value++]=s;
            }

            demo1.countMaxOccurrence(result);
            //System.out.println(result.length);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}