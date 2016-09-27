import java.util.LinkedList;

/**
 * Created by Mayank on 9/17/16.
 */
public class Serious implements Comparable<Serious>{

        private int camera;
        private int size;
        private int battery;
        private String model;

        public Serious(String model, int camera,int size,int battery){
            this.battery=battery;
            this.size=size;
            this.battery=battery;
            this.model=model;
        }

        public int getSize(){
            return size;
        }
    @Override
    public int compareTo(Serious o) {
        if(this.getSize()>o.getSize()){
            return 1;
        }else if(o.getSize()>this.getSize()){
            return -1;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        int[] random = {2,4,5,7,9,11};
        Serious iphone6s = new Serious("iphone6s",12,4,4400);
        Serious iphone7 = new Serious("iphone7",14,5,4800);
        if(iphone6s.compareTo(iphone7)>0){
            System.out.println("6s is better");
        }else{
            System.out.println("7 is better");
        }

    }


}
