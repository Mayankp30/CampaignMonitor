import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Mayank on 9/10/16.
 */
public class Divisors {

    public static int[] calculateDivisors(int number){
        LinkedList<Integer> list = new LinkedList<>();
        if(number<1){
            System.out.println("Invalid Input");
        }

        for(int i=1;i<=number;i++){
            if(number%i==0){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        int k=0;
        for (int element: list) {
            result[k++]=element;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        calculateDivisors(num);



    }
}
