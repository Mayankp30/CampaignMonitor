import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Mayank on 9/20/16.
 */


class River{


}

public class Creek {

    public int addDigits(int num) {
        while (num > 9) {  // 23
            num = getInt(num);
        }
        return num;
    }
    private int getInt(int num) {
        int result = 0;
        while (num >= 10) {
            result += num % 10; // r = 0 + 23%10 = 3
            num /= 10;  // num = 23/10 = 2
        }
        result += num;
        return result;
    }

    boolean palindrome(String word){
        char[] array = word.toCharArray();
        int front=0;
        int rear=array.length-1;
        while(front<rear){
            if(array[front]!=array[rear]){
                return false;
            }++front;
            --rear;
        }
        return true;
    }
    boolean prime(int n){
        if(n%2==0){
            return false;
        }int temp;
        for(int i=2;i<n/2;i++){
            temp=n%i;
            if(temp==0){
                return false;
            }
        }
        return true;
    }

    int factorial(int n ){

        int result=1;
        for(int i =1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    static int facRecursion(int n ){
        if(n==0){
            return 1;
        }else{
            return n * facRecursion(n-1);
        }
    }
    public static void main(String[] args) {
        Creek creek= new Creek();
        System.out.println(creek.facRecursion(5));



        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Zlatan");
        mylist.add("Pogba");
        mylist.add("Mata");
        mylist.add("Ronney");

        ListIterator<String> iterator = mylist.listIterator(mylist.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }

         // immutability is property of an object whereas final is property of variable

}
