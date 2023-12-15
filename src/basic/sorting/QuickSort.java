package basic.sorting;

public class QuickSort {
    public static int partition(int[] arr,int start,int end){
        int high=arr[end];
        int j=start-1;
        for(int i=start;i<=end-1;i++){
            if(arr[i]<high){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j+1];
        arr[j+1]=arr[end];
        arr[end]=temp;
        return j+1;

    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pi=partition(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }

    }
    public static void main(String[] args){
        int[] arr={12,2,3,23,4,34};
        int len=arr.length-1;
        quickSort(arr,0,len);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
