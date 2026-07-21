class Solution {
    public int compress(char[] chars) {
        String s = new String(chars);
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) sb.append(count);
                count = 1;
                sb.append(curr);
            }

        }
        if (count > 1)  sb.append(count);
        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();

    }
}