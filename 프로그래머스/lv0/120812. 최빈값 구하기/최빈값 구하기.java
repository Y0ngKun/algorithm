class Solution {
     public int solution(int[] array) {
        int answer = array[0];
        int max = 0;
        int[] maxArr = new int[1000];

        for(int i = 0; i < array.length; i++){
            maxArr[array[i]]++;
            if(max < maxArr[array[i]]){
                max = maxArr[array[i]];
                answer = array[i];
            }
        }
        int tmp = 0;
        for(int j=0; j<1000; j++){
            if(max == maxArr[j]) tmp++;
            if(tmp > 1) answer = -1;
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}