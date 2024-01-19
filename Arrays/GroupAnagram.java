class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

      // extract string characters  into word 
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);// sorting the characters of string
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
  
  public static void main(String [] args){
    String strs = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagram(strs));
}
}
