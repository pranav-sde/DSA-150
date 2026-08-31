class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        
        StringBuilder encoded = new StringBuilder();
        
        for (String s : strs) {
            encoded.append(Base64.getEncoder().encodeToString(s.getBytes()));
            encoded.append("&");
        }
        
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        if (str.isEmpty()) return decoded;

        // Passing -1 as the second argument ensures trailing empty strings are NOT dropped
        String[] tokens = str.split("&", -1);

        // The loop runs for length - 1 because the final split will always create an extra empty string after the last '&'
        int n = tokens.length - 1; 

        for (int i = 0; i < n; i++) {
            byte[] decodedBytes = Base64.getDecoder().decode(tokens[i]);
            decoded.add(new String(decodedBytes));
        }
       
        return decoded;
    }
}
