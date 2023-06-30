class Solution {
    public List<String> fizzBuzz(int n) {
          List<String> answer = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            answer.add(i,i+1+"");

            if((i+1)%3==0){
                answer.remove(i);
                answer.add(i,"Fizz");
            }
            else if ( (i+1)%5==0 ){
                answer.remove(i);
                answer.add(i,"Buzz");
            }
            if( ((i+1)%3==0) && ((i+1)%5==0) ){
                answer.remove(i);
                answer.add(i,"FizzBuzz");
            }

        }
        return answer;
    }
}