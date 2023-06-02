//time complexity in best case:O(n)
//time complexity in worst case:O(n^2)
//space complexity:O(n)

public class KthLargest{
    public static int partiton(int[] arr,int l,int h){

        int i=l;
        //pivot as the first element in array
        int pivot=arr[l];

        for(int j=l+1;j<=h;j++){
            //j--to take care of the bigger elements than pivot
            //i--to take care of the smaller elements than pivot
            if(arr[j]>=pivot){
                i++;
                //swap(arr[i],arr[j])
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap(arr[l],arr[i])
        //to return the correct index of pivot element
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static int selectionP(int[] arr,int l,int h,int k){
        
        int m=partiton(arr, l, h);
          if(m==k-1){
            return arr[m];
           }
          else if(m<k-1){
                return selectionP(arr, m+1, h, k);
            }
            else{
             return selectionP(arr, l, m-1, k);
            }
        
    }
    public static void main(String[] args) {
        

        int[] arr={4,3,3,2,1};
        
        int n=arr.length;
        int k=4;
        
        int result=selectionP(arr,0,n-1,k);
        System.out.println(result);
    }
}