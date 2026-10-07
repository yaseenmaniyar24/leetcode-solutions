class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1};
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {

            lastSeen[s.charAt(i) - 'a'] = i;
            

            int minIdx = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            

            if (minIdx != -1) {
               
                count += minIdx + 1;
            }
        }
        
        return count;
    }
}