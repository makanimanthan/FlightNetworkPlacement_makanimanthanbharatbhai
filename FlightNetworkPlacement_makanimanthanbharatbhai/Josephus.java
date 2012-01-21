import java.lang.StringBuffer;
 
public class Josephus {
 
	public static void main (String[] args) {
 
		int num = 0;
		int pass = 0;
		int index = 0;
		String N = args[0];
		String M = args[1];
		System.out.println("There will be " + N + " people.");
		System.out.println("A person will be eliminated for every " + M + " touches.");
		Integer tmpN = Integer.valueOf(N);
		num = tmpN.intValue();
		Integer tmpM = Integer.valueOf(M);
		pass = tmpM.intValue();
		int[] deleted = new int[num];
		StringBuffer josephus = new StringBuffer(num);
		for(int i=0; i<num; i++) {
			josephus.append((char)(i+1));
		}
		System.out.println();
		System.out.println((int)josephus.charAt(pass-2));
 
		for(int i=0; i<num-1; i++) {
 
			if((index+pass) > (num)) {
 
				index = (index + pass) % (num);
 
				//Get the value from the StringBuffer, then delete the value.
				deleted[i] = (int)josephus.charAt(index);
				josephus.delete(index, index+1);
 
			} else {
 
				index += pass;
				deleted[i] = (int)josephus.charAt(index);
				josephus.delete(index, index);
 
			}
 
		}
 
		System.out.println("The final remaining member is " + (int)josephus.charAt(0));
	}
}