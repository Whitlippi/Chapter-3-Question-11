package TestPackage;

public class BookTest {
	
	public static void main(String[] args){
		Book twilight = new Book();
			twilight.initialize(3);
			for (int i = 0; i<twilight.getNumPages(); i++){
				System.out.println("The current page is: "+ twilight.getCurrentPage());
				System.out.println("The number of pages left are: "+ (twilight.getNumPages()-twilight.getCurrentPage())+" pages");
				twilight.nextPage();
			}
			
		
	}

}
