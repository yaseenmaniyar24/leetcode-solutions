class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZeros = 0;
        int length = arr.length - 1;

        // Step 1: Count zeros that can fit within the array length
        for (int left = 0; left <= length - possibleZeros; left++) {
            if (arr[left] == 0) {
                // Edge case: zero is at the boundary and cannot be duplicated fully
                if (left == length - possibleZeros) {
                    arr[length] = 0; // copy zero to the last position without duplication
                    length--;
                    break;
                }
                possibleZeros++;
            }
        }

        // Step 2: Copy elements backward starting from the valid end
        int last = length - possibleZeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleZeros] = 0;
                possibleZeros--;
                arr[i + possibleZeros] = 0;
            } else {
                arr[i + possibleZeros] = arr[i];
            }
        }
    }
}