class Solution {
      public int solution(int price) {
		  
	        int discount = 0;
	        
	        for(int i = 0; i<1;) {
	        	
	        	if((100000 <= price) && (price < 300000) ) {
	        		discount = 1;
	        	}
	        	if((300000 <= price) && (price < 500000) ) {
	        		discount = 2;
	        	}
	        	if((price >= 500000) && (price <= 1000000)) {
	        		discount = 3;
	        	}
	        	break;
	        }
	        
	        switch(discount) {
	        case 1: price = (int)(price*0.95f); break;
	        case 2: price = (int)(price*0.9f); break;
	        case 3: price = (int)(price*0.8f); break;
	        default:break;
	        }
	    System.out.println(price);
	    return price;
	    }
}