class Solution {
    public int solution(String my_string) {
		String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i+=2) {
        	if(arr[i].equals("+"))answer = answer += Integer.valueOf(arr[i+1]);
        	else if(arr[i].equals("-"))answer = answer -= Integer.valueOf(arr[i+1]);
        	else {
        		break;
        	}
        	if(i == arr.length-1 ) break;
        }
        System.out.println(answer);
        return answer;
    }
}