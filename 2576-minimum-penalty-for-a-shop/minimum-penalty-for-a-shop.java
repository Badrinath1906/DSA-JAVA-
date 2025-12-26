class Solution {
    public int bestClosingTime(String customers) {
        int score = 0;
        int maxscore = 0;
        int besthour = 0;
        for (int i = 0; i < customers.length(); i++) {
            score += (customers.charAt(i) == 'Y') ? 1 : -1;
            if (score > maxscore) {
                maxscore = score;
                besthour = i + 1;
            }
        }
        return besthour;

    }
}