import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int a, int b) {


		BigInteger aa = BigInteger.valueOf(a);
		BigInteger bb = BigInteger.valueOf(b);
		BigInteger x = aa.gcd(bb);

		int bunmo = b / x.intValue();
		
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= bunmo; i++) {
			if(bunmo%i==0) {
				list.add(i);
			}
		}
		
		for(int z : list) {
			if(z%2==0 ||z%5==0) continue;
			else {return 2;}
		}

		return 1;
	}
}