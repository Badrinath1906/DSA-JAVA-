class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())  return list;
            
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        int left = 0;

        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            if (right - left + 1 > p.length()) {
                char leftChar = s.charAt(left);
                sMap.put(leftChar, sMap.get(leftChar) - 1);

                if (sMap.get(leftChar) == 0)  sMap.remove(leftChar);
                left++;

            }
            if (right - left + 1 == p.length() && sMap.equals(pMap))  list.add(left);
                
        }
        return list;

    }

}