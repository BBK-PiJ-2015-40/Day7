public class Spy {
	private static int spyCount = 0;
	private int mySpyID;
	
	public Spy(int spyID){
		mySpyID = spyID;
		spyCount++;
		System.out.println("spyID: " + mySpyID + " spyCount: " + spyCount);
	}
	
	public void die(){
		System.out.println("Spy spyID has been detected and eliminated");
		spyCount--;
		System.out.println("Total Number of Spies: " + spyCount);
		
	}
	
	public static void main(String[] args) {
		Spy mySpy = new Spy(1);
		Spy yourSpy = new Spy(2);
		Spy herSpy = new Spy(3);
		System.out.println("Total Number of Spies: " + spyCount);
		herSpy.die();
	}
	
	
}
