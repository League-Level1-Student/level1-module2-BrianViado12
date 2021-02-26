package _06_tea_party;


public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting = "Hello "  ;
		
		if(isWoman==false&&isKnighted==true) {
			greeting +="Sir " +name;
			
		}
		if(isWoman==false&&isKnighted==false) {
			greeting +="Mr. " +name;
		}
		if(isWoman==true&&isKnighted==true) {
			greeting +="Lady " +name;
		}
		if(isWoman==true&&isKnighted==false) {
			greeting +="Ms. " +name;
		}
    return greeting;
	}
}




