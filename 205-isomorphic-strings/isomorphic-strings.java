class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mp= new HashMap<>();
        for( int i=0 ; i<s.length();i++){
            Character Sch =s.charAt(i);
            Character Tch= t.charAt(i);
            if(mp.containsKey(Sch)){
                if(mp.get(Sch)!= Tch)  return  false;
            }
                else {
                    if(mp.containsValue(Tch)) return false;
                     mp.put(Sch,Tch);
                }

        }
        return true;
        
    }
}