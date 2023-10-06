class Solution {
    public int solution(int[] box, int n) {
        
       int a = Math.floorDiv(box[0], n);
       int b = Math.floorDiv(box[1], n);
       int c = Math.floorDiv(box[2], n);
       
       int answer = a*b*c;
        return answer;
    }
}