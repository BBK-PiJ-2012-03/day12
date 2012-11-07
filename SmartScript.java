public class SmartScript {
	public static void main(String[] args) {
	SmartScript script = new SmartScript();
	script.launch();
	}
	
	
	public void testPhone(Phone p) { //Auto einai Indirect Upcasting, ftiaxnotas dld methodo
	p.call("54");
	SmartPhone p2 = (SmartPhone)p; //Auto einai Downcasting gia na mporesei na kanei to ringAlarm
	p2.ringAlarm("beeeeeeeeeeep");
	//Ama ekana create ena antikeimeno mobilePhone k to vaza se auth th methodo
	//Dn tha mporouse na usarei tis methodous tou MobilePhone px printlastnumbers
	//tha mporouse mono na xrisimopoiisei tis methodous p uparxoun sto interface Phone
	//dld MONO to call
	//ama ithela na usarw tis alles methodous, tha eprepe na to kanw downcast
	}
	
	public void launch() {
	/**Edw hta kanw create antikeimeno GENIKOU tipou Phone (interface),
	*Auto thewreite Direct Upcasting
	*/
	Phone p = new SmartPhone("nokia");  
	
	testPhone(p);

	SmartPhone myMobile =(SmartPhone)p; //Auto einai Downcasting
	System.out.println(myMobile.getBrand());
	myMobile.call("01");
	myMobile.call("02");
	myMobile.call("03");
	myMobile.call("04");
	myMobile.call("05");
	myMobile.call("06");
	myMobile.call("07");
	myMobile.call("08");
	myMobile.call("09");
	myMobile.call("00446925125325");
	myMobile.call("10");
	myMobile.call("11");
	myMobile.call("12");
	
	myMobile.ringAlarm("beeeeeeeeeeep");
	myMobile.playGame("tetris");
	myMobile.printLastNumbers();
	myMobile.browseWeb("google");
	System.out.println(myMobile.findPosition());
	}

	
}
	
	
	