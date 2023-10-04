class Solution {
 public double solution(int balls, int share) {
        
    	double caseOfballs = 1.0;
        for(int i = 1; i <= balls; i++) {
        	caseOfballs *= i;
        }
        System.out.println("caseOfballs = "+caseOfballs);
        
        double caseOfNminusM = 1.0;
        for(int i = 1; i <= (balls-share); i++) {
        	caseOfNminusM *= i;
        }
        System.out.println("caseOfNminusM = " + caseOfNminusM);
        
        double caseOfshare = 1.0;
        for(int i = 1; i <= share; i++) {
        	caseOfshare *= i;
        }
        System.out.println("caseOfshare = " + caseOfshare);
        
        double answer = Math.round(caseOfballs / (caseOfNminusM * caseOfshare ));
        
        System.out.println("double answer = "+answer);
        System.out.println("int answer = "+ (int)answer);
        return answer;
    }
}