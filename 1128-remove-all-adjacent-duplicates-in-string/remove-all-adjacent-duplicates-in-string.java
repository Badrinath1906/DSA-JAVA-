class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        for( int i=0; i<s.length(); i++){
            if(st.size()==0){
                 st.push(s.charAt(i)); 
                 continue;
            }     
            while(st.size()>0) {
            if( st.peek()!=s.charAt(i))  st.push(s.charAt(i));
            else  st.pop(); 
            break;   
            }  
        }
           
     StringBuilder sb = new StringBuilder();
     for(char c:st){  
        sb.append(c); 
    }
     return sb.toString();
    }
}