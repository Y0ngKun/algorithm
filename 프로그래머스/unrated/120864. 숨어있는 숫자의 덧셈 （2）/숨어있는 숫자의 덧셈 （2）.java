import java.util.Arrays;
class Solution {
    public int solution(String my_string) {
		String[] numbers = my_string.split("\\D+");
		
        return Arrays.stream(numbers)
                .filter(s -> !s.isEmpty())
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
    }
}