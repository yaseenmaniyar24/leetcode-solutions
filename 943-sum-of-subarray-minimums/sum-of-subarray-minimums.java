import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long MOD = 1_000_000_007;

        int[] left = new int[n];  // Distance to previous smaller element
        int[] right = new int[n]; // Distance to next smaller or equal element

        Deque<Integer> stack = new ArrayDeque<>();

        // 1. Calculate left distances (Previous Smaller Element)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        stack.clear();

        // 2. Calculate right distances (Next Smaller or Equal Element)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        // 3. Calculate total sum
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long count = (long) left[i] * right[i];
            totalSum = (totalSum + count % MOD * arr[i] % MOD) % MOD;
        }

        return (int) totalSum;
    }
}