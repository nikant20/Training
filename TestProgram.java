import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/*
write a program to count the number of particular characters in a given string.

For Ex. if the string is "abcaba", then the output should be:

a:3
b:2
c:1

write a program by using HashMap.


*/
public class TestProgram {
	
	static void answer(String input) {
		char[] arr = input.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}
			else {
				int count = hm.get(arr[i]);
				count++;
				hm.put(arr[i], count);
			}
		}
		
		Iterator itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			char res = (char) itr.next();
			int value = hm.get(res);
			
			System.out.println(res+":"+value);
		}
		
	}
	
	public static void main(String[] args) {
		answer("abcaba");
	}
}
