class Solution {
    public int countSegments(String s) {
        int count =0;
        if(s.length()==0) return 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') count++;
        }
        if(s.charAt(0)!=' ') count++;
        return count;
        
    }
}