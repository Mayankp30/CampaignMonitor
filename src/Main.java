import java.util.Map;

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

    public int addDigits(int num) {
        while (num > 9) {
            num = getInt(num);
        }
        return num;
    }
    private int getInt(int num) {
        int result = 0;
        while (num >= 10) {
            result += num % 10;
            num /= 10;
        }
        result += num;
        return result;
    }

    public static void main(String[] args) {
        Main demo1 = new Main();
        //System.out.println(demo1.fibonacci(5));

        System.out.println(demo1.addDigits(29));


    }
}
