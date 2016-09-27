import java.util.*;

/**
 * Created by Mayank on 9/8/16.
 */
public class Main {



    public int fibonacci(int n){
        int[] fib = new int[n+1];

        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }

        return fib[n];
    }

    public int factorial(int n){ // 5
        int result=1;
        for(int i=1;i<=n;i++){
            result = result * i;    //  res = 1 * 1, res= 1 * 2; , res = 2 * 3 , res = 6 * 4 , res = 24 * 5
        }
        //return result;


        if(n<=1){
            return n;
        }else{
            return n* factorial(n-1);
        }

    }




    public int addDigits(int num) {
        while (num > 9) {
            num = getInt(num);
        }
        return num;
    }
    private int getInt(int num) {
        int result = 0;
        while (num >= 10) {
            result += num % 10; // 4
            num /= 10; // 24/10  = 2.4 = 2
        }
        result += num;  // 4 +2 = 6
        return result;
    }

    public static void printCommonOccurences(LinkedList<Integer> list) {
        list.add(100);
    }

    public static void main(String[] args) {
        Main demo1 = new Main();

        }

}
