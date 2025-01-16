class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int count = 0;
        int attackIndex = 0;
        int currentHealth = health;
        
        for (int time=1; time<=attacks[attacks.length-1][0]; time++) {
            if (time == attacks[attackIndex][0]) {
                currentHealth -= attacks[attackIndex][1];
                if (currentHealth <= 0) {
                    return -1;
                }
                count = 0;
                attackIndex++;
            } else {
                currentHealth += x;
                if (currentHealth > health) currentHealth = health;
                count++;
                if (count == t) {
                    currentHealth += y;
                    if (currentHealth > health) currentHealth = health;
                    count = 0;
                }
            }
        }
        return currentHealth;
    }
}