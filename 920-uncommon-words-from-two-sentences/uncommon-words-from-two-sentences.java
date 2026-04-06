class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        String[] arr = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
        }

        String[] brr = s2.split(" ");
        for (int i = 0; i < brr.length; i++) {
            map1.put(brr[i], map1.getOrDefault(brr[i], 0) + 1);
        }
        
        for (String key : map1.keySet()) {
            if (map1.get(key) == 1)
                list.add(key);
        }
        return list.toArray(new String[0]);
    }
}