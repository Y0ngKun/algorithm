class Solution {
  public String[] solution(String my_str, int n) {
        String[] dd = my_str.split("(?<=\\G.{" + n +"})");
        return dd;
    }
}
    