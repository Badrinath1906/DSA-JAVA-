class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:str){
            for(int i= word.length()-1; i>=0;i--){
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}