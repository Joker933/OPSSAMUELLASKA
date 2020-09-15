import java.util.Scanner;
import java.util.*;

class MilujuSama {
	public static void main(String args[]) {
	
		System.out.print("Zadavej cisla a 'END' pro ukonceni: ");
		Scanner uzivatel = new Scanner(System.in);
		String input = "";
		int sum = 0;
		ArrayList<String> cisilka = new ArrayList<String>();
		ArrayList<Integer> cisilka2 = new ArrayList<Integer>();


		while (!input.equals("END")) {
			input = uzivatel.nextLine();
			cisilka.add(input);

		}

		int y = cisilka.size()-1;
		cisilka.remove(y);
		for(int i = 0; i < cisilka.size(); i++) {
			cisilka2.add(Integer.parseInt(cisilka.get(i)));
		}	

			int min = cisilka2.get(0);
			int max = cisilka2.get(0);
			
			int minIndex = 0, maxIndex = 0;
				
			for(int i = 1; i < cisilka2.size(); i++ ){
					
			if( cisilka2.get(i) < min ){
			min = cisilka2.get(i);
			}

					
			if( cisilka2.get(i) > max ){
			max = cisilka2.get(i);
			}
		 
		}
				
		System.out.println("Nejmensi: " 
							+ min 
		);
		 
		System.out.println("Nejvetsi: " 
							+ max 
		);
		for (int i : cisilka2) {
			sum += i;
		}
		int average = sum / cisilka2.size();
		System.out.println("Suma = " + sum);
		System.out.println("Prumer = " + average);		
		}
}