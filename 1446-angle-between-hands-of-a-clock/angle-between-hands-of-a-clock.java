class Solution {
    public double angleClock(int hour, int minutes) {
        double minu = 6.0*minutes;
        double ho = 30.0*hour + 0.5*minutes;
        double diff = Math.abs(minu-ho);
        return Math.min(diff,360-diff);
    }
}