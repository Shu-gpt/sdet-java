package basic.sorting;

public class MergeSort {
    public static void merge(int[] arr,int start,int mid,int end){
        int len1=mid-start,len2=end-mid+1;
        int left=0,right=0;
        int[] arr1=new int[len1];
        int[] arr2=new int[len2];
        for(int i=0;i<len1;i++){
            arr1[i]=arr[start+i];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=arr[mid+i];
        }
        while(left<len1 &&right<len2){
            if(start<mid){
                if(arr1[left]<arr2[right]){
                    arr[start++]=arr1[left++];
                }else{
                    arr[start++]=arr[right++];
                }

            }else{
                if(arr1[left]<arr2[right]){
                    arr[mid++]=arr1[left++];
                }else{
                    arr[mid++]=arr[right++];
                }
            }

        }

    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end-1){
            int mid=start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    public static void main(String[] args){
        int[] arr={10,5,2,56,23,45,12};
        int len=arr.length-1;
        mergeSort(arr,0,len);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
