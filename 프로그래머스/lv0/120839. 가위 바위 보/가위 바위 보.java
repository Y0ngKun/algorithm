class Solution {
public String solution(String rsp) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		int rock = 0, scissors = 2, paper = 5;

		for(int i = 0 ; i < rsp.length(); i++) {
			switch (rsp.charAt(i)) {
			case '0':
				answer += "5";
				break;
			case '2':
				answer += "0";
				break;
			case '5':
				answer += "2";
				break;

			default:
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
}