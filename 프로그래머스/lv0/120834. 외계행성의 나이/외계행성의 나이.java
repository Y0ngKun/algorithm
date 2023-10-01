class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ageChar = {'a','b','c','d','e','f','g','h','i','j'};
        	if(age >= 1000) answer = "baaa";
        	if((age >= 100) && (age<1000)) {
        		answer += ageChar[age/100];
        		answer += ageChar[ (age - ((age/100)*100 ))  / 10];
        		answer += ageChar[ (age) - (age/10*10)];
        	}
        	
        	if((10 <= age) && (age < 100)) {
        		answer += ageChar[age/10];
        		answer += ageChar[age-(age/10*10)];
        	}
        	if(age < 10) {
        		answer += ageChar[age];
        	}
        System.out.println("answer = "+ answer + ", age = " + age);
        return answer;
    }
}