import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by Mayank on 9/16/16.
 */
public class Fun {


    static void permutation(char arr[],int l,int r){
        HashSet<String> set = new HashSet<>();
        Dictionary<String , LinkedList<String>> table = new Hashtable<>();
        if(l==r){
            String text = String.valueOf(arr);
            System.out.println(text);
        }else{
            for(int i=1;i<r;i++){
                swap(arr,l,i);
                permutation(arr,l+1,r);
                swap(arr,l,i);
            }
        }
    }

    public void atEnd(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[count++]=array[i]; // 402015 - [4215]
            }
        }

        while(count<array.length){  //421500   3<6
            array[count++]=0;
        }

        for (int i:
             array) {
            System.out.println(i);

        }
    }

    public void commonIntegers(int[] nums) {
        int value = 0;
        for (int i = 0; i < nums.length-1; i++) {   // 1 1 2 3 4 4 4
            if (nums[i] == nums[i + 1]) {   //value = 3 // 4
                value++;
            }
        }
        System.out.println(nums.length-value);
    }

    static void swap(char arr[],int a,int b){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void letMerge(int[] nums1, int[] nums2){
        int i=0;
        int j=0;
        LinkedList<Integer> list = new LinkedList<>();


        while(i<nums1.length && j<nums2.length){ // 1 2    3 4
            if(nums1[i]<nums2[j]){   // 1 2
                list.add(nums1[i++]);
            }else if(nums2[j]<nums1[i]){
                list.add(nums2[j++]);
            }else{
                list.add(i);
                i++;
                j++;
            }
        }

       while(i<nums1.length){
            list.add(nums1[i++]);
        }
        while(j<nums2.length){
            list.add(nums2[j++]);
        }
        for (int l : list){
            System.out.print(l + " ");
        }
        System.out.println("done");

        int[] result = new int[list.size()];
        int count=0;
        for (int k: list) {
            result[count++]=k;
        }

        int length = result.length;
        System.out.println("length: " + length);
        int mid = length/2;
        int element = result[mid];
        System.out.println("middle: " + mid);
        double median=0;
        if(length%2==0){
            double prac = (double) (result[mid]+result[mid-1])/2;
             //double ans = prac/2;
            median = prac;
        }else if(length%2==1){
            median=result[mid];
        }
         //return median;
        System.out.println(median);

    }


    public void inSection(int[] num1,int[] num2){
        int i=0;
        int j=0;
        int m=num1.length;
        int n=num2.length;
        LinkedList<Integer> reslist = new LinkedList<>();


        while(i<m && j<n){          // 14
            if(num1[i]<num2[j]){    // 2 4 7 10 12 14 16
                i++;
            }else if(num2[j]<num1[i]){ // 4 7
                j++;
            }else{
                reslist.add(num1[i]);
                i++;
                j++;
            }
        }

        for (int value:reslist) {
            System.out.print(value + " ");
        }

    }


    int equilibrium(int arr[])
    {
        int n = arr.length;
        int i, j;
        int leftsum=0;
        int sum=0;
        for(int k=0;k<n;k++){
            sum += arr[k];
        }

        for (i = 0; i < n; ++i)  // -4 2 3 5 1 -7
        {
            sum=sum-arr[i];

            if (leftsum == sum)
                return i;

            leftsum=leftsum+arr[i];
        }


        /* return -1 if no equilibrium index is found */
        return -1;
    }

    public static void main (String[] args)
    {

        Fun fun = new Fun();
        //int[] random = {1,0,3,4,0,6};
        //fun.atEnd(random);
        //int[] nums={1,1,2,3,4,4,4};
        //fun.commonIntegers(nums);
        //int[] nums1 = {1,4,8,10};  // 1 2 3 4 5 6 10
        //int[] nums2 = {2,4,4,4,8,6,10};
        //fun.letMerge(nums1,nums2);
        //fun.inSection(nums1,nums2);

        int array[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(fun.equilibrium(array));

    }

}
