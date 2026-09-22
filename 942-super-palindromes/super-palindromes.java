class Solution {
    public int superpalindromesInRange(String left, String right) {
        long L = Long.parseLong(left);
        long R = Long.parseLong(right);
        int count = 0;

        // Generate odd and even length palindromes k up to 10^9
        // MAGIC = 100,000 (since mirroring a 5-digit number gives up to 9 digits, ~10^9)
        int MAGIC = 100000;

        // 1. Generate odd length palindromes (e.g., 123 -> 12321)
        for (int i = 1; i < MAGIC; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 2; j >= 0; j--) {
                sb.append(sb.charAt(j));
            }
            long k = Long.parseLong(sb.toString());
            long k2 = k * k;

            if (k2 > R) break; // Exceeds upper bound
            if (k2 >= L && isPalindrome(k2)) {
                count++;
            }
        }

        // 2. Generate even length palindromes (e.g., 123 -> 123321)
        for (int i = 1; i < MAGIC; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 1; j >= 0; j--) {
                sb.append(sb.charAt(j));
            }
            long k = Long.parseLong(sb.toString());
            long k2 = k * k;

            if (k2 > R) break; // Exceeds upper bound
            if (k2 >= L && isPalindrome(k2)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(long val) {
        return val == reverse(val);
    }

    private long reverse(long val) {
        long rev = 0;
        while (val > 0) {
            rev = rev * 10 + val % 10;
            val /= 10;
        }
        return rev;
    }
}