package Sorting;

public class BubbleSort {
    public  static void bubbleSort(int arr[]){

        int n= arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){

            swapped =false;

            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (swapped==false)
                break;
        }
    }
    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        bubbleSort(arr);
        printArray(arr);
    }

}
