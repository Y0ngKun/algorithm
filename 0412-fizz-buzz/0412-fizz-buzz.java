/*
문제는 쉽게풀었지만 성능이 최악.
먼저 전부 다 값을 넣고 remove했다가 add해서 그런 듯 하다.
Fizz Buzz 들을 먼저 넣고 나머지를 add했으면 훨씬 나을듯..

-FizzBuzz는 둘의 최소공배수(15)로 나누는 게 더 빠를듯하다 
-나머지 수(3,5 제외한 수) add할 때 그냥 지역 변수 i = 1로 하고  Integer.toString(i)으로 하는 게 더 좋을 듯 하다. (형변환 해야하니까 Integer 오토박싱)
*/

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
