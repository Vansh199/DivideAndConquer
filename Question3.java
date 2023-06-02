//time complexity:O(n)
//space complexity:O(1)
public class Question3 {
    public static void segregateNumbers(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            // Move left pointer until a positive number is found
            while (left < right && arr[left] < 0) {
                left++;
            }
            
            // Move right pointer until a negative number is found
            while (left < right && arr[right] >= 0) {
                right--;
            }
            
            // Swap the positive and negative numbers
            if (left < right) {
                swap(arr, left, right);
            }
        }
        
        // Print the segregated array
        System.out.println("Segregated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {19,-20,7,-4,-13,11,-5,3};
        segregateNumbers(arr);
    }
    
}
