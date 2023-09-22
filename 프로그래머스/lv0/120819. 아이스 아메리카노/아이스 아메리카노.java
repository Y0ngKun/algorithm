class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        final int americano = 5500;
        int counting = 0;
        
        counting = money / americano;
        answer[0] = counting;
        answer[1] = money-(americano*counting);
        
        System.out.println(answer[1]);
        return answer;
    }
}