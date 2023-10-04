class Solution {
 public double solution(int balls, int share) {
        
    	double caseOfballs = 1.0;
        for(int i = 1; i <= balls; i++) {
        	caseOfballs *= i;
        }
        
        double caseOfNminusM = 1.0;
        for(int i = 1; i <= (balls-share); i++) {
        	caseOfNminusM *= i;
        }
        
        double caseOfshare = 1.0;
        for(int i = 1; i <= share; i++) {
        	caseOfshare *= i;
        }
        
        double answer = Math.round(caseOfballs / (caseOfNminusM * caseOfshare ));

        return answer;
    }
}