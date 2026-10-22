// Last updated: 10/22/2026, 11:21:17 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String [] sWihoutSpaces = s.split("\\s+");
        String Last = sWihoutSpaces[sWihoutSpaces.length -1];

        int res= Last.length();
    
        return res;
    }
}