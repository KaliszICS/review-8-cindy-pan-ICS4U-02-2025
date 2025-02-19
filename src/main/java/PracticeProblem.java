public class PracticeProblem {


	public static String pluralize(String word)
	{
		word = word.trim();
		String end = "Y";
		String endAgain = "ey";
		String endLast = "ife";

		if (word.length()>=2){
			if (word.substring(word.length()-2).equalsIgnoreCase(endAgain)){
			return "eys";
		}
	
		else if (word.substring(word.length()-3).equalsIgnoreCase(endLast)){
			return "ives";
		}
		else if (word.substring((word.length()-1)).equalsIgnoreCase(end)){
			return "ies";
		}
		else {
			return "s";
		}
		}
	 else if (word.length()>=1){
		if (word.substring((word.length()-1)).equalsIgnoreCase(end)){
			return "ies";
		}
		else {
			return "s";
		}
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
		

	
	}

	public static boolean isLeapYear(int year){
		if (year%4 ==0){//step one
			if (year%100==0){ //step two
				if (year%400==0){ //step 3
					return true;
				}
				else{
					return false;
				}
			}
			else { //step 2
				return true;
			}
		}
		else { //step 1
			return false;
		}
	} 

	}

			
		


	//public static 

