class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            price -= (double) price * 20 / 100;
        } else if (price >= 300000) {
            price -= (double) price * 10 / 100;
        } else if (price >= 100000) {
            price -= (double) price * 5 / 100;
        }
        return (int) price;
    }
}