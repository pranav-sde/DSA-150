class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        char []st = s.toCharArray();
        char [] nt = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(nt);

        for(int i = 0;i<st.length;i++){
            if(st[i] != nt[i]){
                return false;
            }
        }

        return true;
    }
}
