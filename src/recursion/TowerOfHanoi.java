package recursion;

public class TowerOfHanoi {

	public void TOH(int numberOfDisk, String source, String middle, String dest){
		
		if(numberOfDisk==1) {
			System.out.println("Plate "+numberOfDisk+" moved from "+source+" to "+dest);
			return;
		}
		TOH(numberOfDisk-1, source, dest, middle);
		System.out.println("Plate "+numberOfDisk+" moved from "+source+" to "+dest);
		TOH(numberOfDisk-1, middle, source, dest);
	}
	
	public static void main(String[] args) {
		new TowerOfHanoi().TOH(3, "A", "B", "C");
	}
}
