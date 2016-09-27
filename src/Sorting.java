/**
 * Created by Mayank on 9/17/16.
 */
public class Sorting {

    public int doPartition(int[] A, int start, int end){
        int pivot = A[end];
        int pIndex = start;
        for (int i=0;i<end;i++){
            if(A[i]<=pivot){
                int temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;
                pIndex++;
            }
        }
        int temp1 = A[pIndex];
        A[pIndex] = A[end];
        A[end] = temp1;
        return pIndex;
    }

    public void quickSort(int[] A, int start, int end){

        if(start<end){
            int pIndex = doPartition(A,start,end);
            //System.out.println(pIndex);

            quickSort(A, start, pIndex-1);
            quickSort(A,pIndex+1,end);
        }


    }

    private void insertionSort(int[] array) {
        for (int i=1;i<array.length;i++){  //  4 2 3 5 1
            int value=array[i];  // value-> 2
            int hole = i;  // 1
            while(hole>0 && array[hole-1]>value){  //  2 3 4 5 1
                array[hole]=array[hole-1];
                hole=hole-1;
            }
            array[hole]=value;
        }
    }

    public String strToInt(String word){
        char[] strArray = word.toCharArray();
        int result=0;
        for(int i=0;i<strArray.length;i++){
            result = result*2 + Character.getNumericValue(strArray[i]);
        }
        System.out.println(result);
        result=result+1;

        StringBuilder sb = new StringBuilder();
        while (result >= 0) {
            int r =result%2;
            sb.append(r);
            result=result/2;
        }

        return sb.reverse().toString();
    }



    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] array = {2,5,1,3,7,6,4};


        //sorting.insertionSort(array);
        //System.out.println();
        /*for (int i: array) {
            System.out.print(i +" ");
        }
*/
        //sorting.quickSort(array,0,6);


        String word = "011";
        sorting.strToInt(word);

    }


}
