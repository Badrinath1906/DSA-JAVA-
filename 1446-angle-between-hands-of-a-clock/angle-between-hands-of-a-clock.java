class Solution {
    public double angleClock(int hour, int minutes) {

        double minAngle = minutes * 6;
        double hourAngle = (hour % 12 + minutes / 60.0) * 30;
        double diff = Math.abs(hourAngle - minAngle);

        return Math.min(diff, 360.0 - diff);

    }
}