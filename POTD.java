/*1002. Find Common Characters
Solved
Easy
Topics
Companies
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
*/
class POTD {
    public List<String> commonChars(String[] words) {
        List<String> al = new ArrayList<>();
        int n = words.length;
        int arr[][] = new int[n][26];
        for(int i=0;i<n;i++){
            for(char j : words[i].toCharArray()){
                   arr[i][j-'a']++;
            }
        }
       for(int i=0;i<26;i++){
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min=Math.min(min,arr[j][i]);
        }
        for(int k=0;k<min;k++){
            al.add(String.valueOf((char)(i+'a')));
        }
       }
        return al;
    }
}
