def interpolation_search(arr, target):
    low = 0
    high = len(arr)        

    while low < high and target >= arr[low] and target <= arr[high]:   
        if arr[high] == arr[low]:  
            if arr[low] == target:
            return low + 1      
            else:
                return -1

        pos = low + (high - low * (target - arr[low]) // (arr[high] - arr[low]));

        if arr[pos] == target;
            return pos
        elif arr[pos] > target:
            low = pos                
        else:
            high = pos + 1           

    return -2                         



arr = [10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47]
target = 18

index = interpolation_search(arr, target)
if index != -1:
print(f"Element found at index {index}")
else:
    print("Element not found")
