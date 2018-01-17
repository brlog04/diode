import java.util.*;

class new1 {

	int[] statusDiode = {0,0,0,0,0};
	int[] excludeDiode = {0,0,0,0,0};
	
	public static void main (String[] args){
		
	new1 new2 = new new1();
	for (int i = 0; i < 10 ; i++){
		new2.upaliDiodu();
	}

	}
	public void upaliDiodu(){
		
		    int upaliDioduBr = 0;
			int diodaUpaljena = 0;
			int programBreak = 0;
			
			while (diodaUpaljena == 0){
				if (excludeDiode[0] ==1 && excludeDiode[1] ==1 && excludeDiode[2] ==1 && excludeDiode[3] ==1 && excludeDiode[4] ==1 ){
					programBreak = 1;
					break;
				}
				
				System.out.println(" status: "+Arrays.toString(statusDiode));
				System.out.println("exclude: "+Arrays.toString(excludeDiode));
				
				upaliDioduBr = (int)(Math.random()*5)+1;
				if (excludeDiode[upaliDioduBr-1] == 0) {
					if (statusDiode[upaliDioduBr-1] == 0){
						statusDiode[upaliDioduBr-1] = 1;
						diodaUpaljena = 1;
					}
					else {
						excludeDiode[upaliDioduBr-1] = 1;				
					}
				}
			}
			if (programBreak == 0){
				System.out.println(upaliDioduBr);
				System.out.println(statusDiode[upaliDioduBr-1]);
			}
	}
}
