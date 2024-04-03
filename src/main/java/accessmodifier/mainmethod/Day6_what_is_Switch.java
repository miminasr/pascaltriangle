package accessmodifier.mainmethod;

public class Day6_what_is_Switch {

	public static void main(String[] args) {
		WhichDigitDenotewhichMonth();
	}
	public static void WhichDigitDenotewhichMonth() {
		int month = 7; //july 
		String monthName = "";
		
		switch(month) {
		case 1: monthName="1 - January";
		break;
		
		case 2: monthName="2 - Feb";
		break;
		
		case 3: monthName="3 - Mar";
		break;
		
		case 4: monthName="4 - Apr";
		break;
		
		case 5: monthName="5 - May";
		break;
		
		case 6: monthName="6 - Jun";
		break;
		
		case 7: monthName="7 - Jul";
		break;
		
		case 8: monthName="8 - Aug";
		break;
		
		case 9: monthName="9 - Sep";
		break;
		
		case 10: monthName="10 - Oct";
		break;
		
		case 11: monthName="11 - Nov";
		break;
		
		case 12: monthName="12 - Dec";
		break;
		
		default: System.out.println("invalid month value");
		}
		//print the month
		System.out.println(monthName);
		
	}
	
	
	public static void determinevowelamong26Alphabers() {
		//hw using switch statement
		//a, e, i, o, u 
	}
}

	