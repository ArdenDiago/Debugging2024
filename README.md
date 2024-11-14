
# Documentation for String Operations

## Palindrome Check

### Function: `isPalindrome(String s)`

**Description:**
The `isPalindrome` function checks if a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward, ignoring spaces, punctuation, and case.

### Parameters:
- `s` (String): The input string that needs to be checked.

### Returns:
- `boolean`: Returns `true` if the string is a palindrome, otherwise returns `false`.

### Example:
- `isPalindrome("madam")` → Returns `true`
- `isPalindrome("hello")` → Returns `false`

### Logic:
1. The string is normalized by removing any non-alphabetic characters and converting all letters to lowercase (optional for stricter palindrome checks).
2. The function then compares characters from the start and end of the string, moving towards the middle.
3. If any characters do not match, the function returns `false`.
4. If all characters match, the function returns `true`.


## Interpolated Intersection

### Function: `interpolateIntersection(int[] arr1, int[] arr2)`

**Description:**
The `interpolateIntersection` function finds the intersection of two arrays. The intersection is defined as the set of elements that are present in both arrays, and the result is sorted in ascending order.

### Parameters:
- `arr1` (int[]): The first array of integers.
- `arr2` (int[]): The second array of integers.

### Returns:
- `int[]`: A new array containing the elements that are common to both `arr1` and `arr2`, sorted in ascending order.

### Example:
- `interpolateIntersection([1, 2, 3, 4, 5], [4, 5, 6, 7, 8])` → Returns `[4, 5]`
- `interpolateIntersection([1, 2, 3], [4, 5, 6])` → Returns `[]`

### Logic:
1. Iterate through both arrays and collect elements from the first array into a set.
2. Check if each element of the second array exists in the set created from the first array.
3. If it exists, add it to the intersection.
4. Finally, sort the intersection and return it.


## Reverse of a String

### Function: `reverseString(String s)`

**Description:**
The `reverseString` function reverses the characters of a given string, producing a new string with the characters in the reverse order.

### Parameters:
- `s` (String): The input string to be reversed.

### Returns:
- `String`: The reversed string.

### Example:
- `reverseString("hello")` → Returns `"olleh"`
- `reverseString("world")` → Returns `"dlrow"`

### Logic:
1. The function iterates through the characters of the string, starting from the end.
2. The characters are then arranged in the opposite order to form a new string.
3. The reversed string is returned.

---

### General Information:

1. **Palindrome Check:**
   - The complexity of palindrome checking is linear, O(n), as we compare characters from both ends toward the center.
   - This check can be modified to ignore spaces and punctuation if necessary.

2. **Interpolated Intersection:**
   - This operation works in O(n log n) time complexity, primarily due to the sorting step.
   - It efficiently finds the common elements between two arrays using a set-based approach for faster lookups.

3. **Reverse of a String:**
   - Reversing a string typically has a time complexity of O(n), where `n` is the length of the string.
   - It's a straightforward operation that can be implemented using various methods such as iteration or built-in reverse functions.
