public class PracticeProblem {


	public static String pluralize(String word)
	{
		String end = "y";
		String endAgain = "ey";
		String endLast = "ife";
		if (word.substring(word.length()).equalsIgnoreCase(end)){
			return "ies";
		}
		else if (word.substring((word.length()-3)).equalsIgnoreCase(endAgain)){
			return "eys";
		}
		else if (word.substring(word.length()-3).equalsIgnoreCase(endLast)){
			return "ives";
		}
		else {
			return "s";
		}

	}

	public static int min(int num, int numagain, int numlast){
		if (num < numagain && num < numlast){
			return num;
		}
		else if (numagain<num && numagain<numlast){
			return numagain;
		}
		else{
			return numlast;
		}
		

	public static String isLeapYear(int year){
		if (year%4 == 0){
			
		}
	}

	}



	//public static 
}
