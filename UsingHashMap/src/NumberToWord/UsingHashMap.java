package NumberToWord;
import java.util.HashMap;
import java.util.Scanner;

public class UsingHashMap {
	static HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		myMap.put(1, "one");
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");
		myMap.put(6, "six");
		myMap.put(7, "seven");
		myMap.put(8, "eight");
		myMap.put(9, "nine");
		myMap.put(10, "ten");
		
		int number = 0;
		String words = "";
		
		do{
			System.out.print("\nEnter a number: ");
			number = scan.nextInt();
			if(myMap.containsKey(number)){
				System.out.println("You entered " + myMap.get(number));
			}else{
				words = NumberToWords.convertNumberToWords(number);
				myMap.put(number, words);
				System.out.println(words + " is added");
			}
			
			System.out.print("Would you like to try again? y/n ");
			
		}while(scan.next().equalsIgnoreCase("y"));
		
		scan.close();
	}

}
