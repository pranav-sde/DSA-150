class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if(n <=0){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            // Sort the characters of the current string to form the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // If the key doesn't exist, create a new empty list
            map.putIfAbsent(key, new ArrayList<>());
            
            // Add the original string to the map
            map.get(key).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}
