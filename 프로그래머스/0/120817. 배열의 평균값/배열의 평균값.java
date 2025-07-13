class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        
        // 배열에 있는 모든 숫자를 더하기
        for (int num : numbers) {
            sum += num;
        }
        // 평균 구해서 리턴
        return sum / numbers.length;
    }
}