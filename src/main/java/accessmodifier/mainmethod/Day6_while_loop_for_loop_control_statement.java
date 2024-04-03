package accessmodifier.mainmethod;


import java.util.*;

public class Day6_while_loop_for_loop_control_statement {

	public static void whatIswhileloop() {
		int i = 1; //declaration is done
		while(i<6) { //then gave it a condition
			System.out.println("keep printing the value of 1");
		break;
		//logic - 1<6 then true. 
		//once the print statement is done
		//then i becomes 2
		//2 is less than 6 true 
		}
		
		
	}
	public static void printNumbersFrom1to10() {
		
		
		int i =1;
				while(i<11) {
					System.out.println(i);
					i++;
					
				}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //while loop if the end point is unclear- tends to infinity 
	   //cnn.commor bbc.com
		whatIswhileloop();	
		//sytax for while loop- decalre a variable 
		
			
		}
	
	/*public static void cnnDotComtotallinksToday() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		*/
		//list<WebElements> totallinks = driver.findElement(By.tagName("a"));
		//System.out.println("Total no of links present today is : " + totallinks.size());
		
}


