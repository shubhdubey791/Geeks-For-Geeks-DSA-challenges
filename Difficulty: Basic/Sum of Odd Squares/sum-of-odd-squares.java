class Solution {
    public int sumofodd(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            sum += odd * odd;
        }

        return sum;
    }
}