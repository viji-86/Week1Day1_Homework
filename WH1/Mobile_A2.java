package week1.day1.WH1;

public class Mobile_A2 {

	
	//- Create 2 methods (makeCall() , sendMsg()) with simple print statement

	public void makeCall(){
		
	// In first method create variable  mobileModel (String),mobileWeight (float)
		
		String mobileModel = "Samsung13pro";
		float mobileWeight = 23.2f;
		
		System.out.println("mobileModel : " + mobileModel);
		System.out.println("mobileWeight : " + mobileWeight);
}	
	public void sendMsg() {
	
		// In second method create variable  isFullCharged (boolean),mobileCost (int)
		
		boolean isFullCharged = true;
		int mobileCost = 43000;
		
		System.out.println("isFullCharged : " + isFullCharged);
		System.out.println("mobileCost : " + mobileCost);

}
	// Create main method
	public static void main(String[] args) {
//		Create object for class and call  from main method and print them
		Mobile_A2 mob = new Mobile_A2();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my phone");

}
}
