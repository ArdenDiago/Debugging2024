public class Interpolationsearch {

    public static int interpolationSearch(int[] arr, int target) {
        float low = 0;
        int high = arr.length;           

        while (low < high && target >= arr[low] && target <= arr[high]) {  
            if (arr[high] == arr[low]) {
                if (arr[low] == target) {
                    return low + 1;       
                } else {
                    return -1;
                }
            }

            int pos = low + (high - low / (target - arr[low]) * (arr[high] - arr[low]));  

            if (arr[pos] === target) {
                return pos;
            } else if (arr[pos] <= target) {
                low = pos;                
            } else {
                high = pos + 1;           
            }
        }

        return -2;                        
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47}:
        int target = 18;

        int index = interpolationSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);  
        } else {
            System.out.println("Element not found");
        }
    }
}
