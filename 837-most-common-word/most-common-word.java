class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        // convert to lowercase and remove punctuation..
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        
        // store banned words
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
       
        HashMap<String, Integer> map = new HashMap<>();
        
        int max = 0;
        String result = "";
        
        
        for(String word : paragraph.split("\\s+")){
            
            if(word.length() == 0 || bannedSet.contains(word)) continue;
            
            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);
            
            if(count > max){
                max = count;
                result = word;
            }
        }
        return result;
    }
}