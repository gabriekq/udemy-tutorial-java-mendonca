package basic_java;

public class ControlFlow {

	public static void main(String[] args) {

		boolean hungry = true;

		if (hungry == true) {
			System.out.println("Im starving ...");
		} else {
			System.out.println("Im not hungry");
		}

		int hungryRating = 5;

		if (!(hungryRating < 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I am starving");
		}

		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion;

		if (favoriteTemp == currentTemp) {

			if (currentTemp <= (favoriteTemp - 30)) {
				opinion = "Its pretty Darn Cold . . .";
			} else if (currentTemp < (favoriteTemp - 20)) {

				opinion = "Its kinda cold out ...";

			} else if (currentTemp >= (favoriteTemp + 10)) {
				opinion = "its hot out";
			} else {
				opinion = "its beatiful day";
			}

		}else {
			opinion ="unknoun temp";
		}
		
		System.out.println(opinion);
		
		int month = 2;
		String monthString;
		
		switch(month) {
		
		case 1: 
			monthString = "January";
		break;
		case 2: 
		monthString = "February";
		break;
		case 3:
			monthString = "March";
		break;
		case 4:
			monthString = "April";
		break;
		default:
			monthString = "Unknown Month";
		break;	
		
		}
		
		System.out.println(monthString);

	}

}
