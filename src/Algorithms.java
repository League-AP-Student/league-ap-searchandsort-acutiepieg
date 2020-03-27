import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> arr) {
		int counter = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	
	public static Double findTallest(List<Double> arr) {
		int tallest = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > arr.get(tallest)) {
				tallest = i;
			}
		}
		return arr.get(tallest);
	}
	
	public static String findLongestWord(List<String> arr) {
		String longest = "";
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).length() > longest.length()) {
				longest = arr.get(i);
			}
		}
		
		return longest;
	}
}
