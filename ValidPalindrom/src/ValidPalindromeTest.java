import java.util.ArrayList;


public class ValidPalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "`l;`` 1o1 ??;l`";
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
		
		if (s.trim().isEmpty()) return true;
        
        String s1 = s.replaceAll("[.,;?:!@`#$%&*\\-() '\"]", "").trim();
        if (s1.isEmpty()) return true;
        
        ArrayList<Character> chars = new ArrayList<Character>();
        
        // add chars to arraylist from last character to first character
        for (int i=s1.length() - 1; i>=0; i--) {
            
        	// if char is letter or is digit, add to arraylist
            if (Character.isLetter(s1.charAt(i)) || Character.isDigit(s1.charAt(i))) {
                chars.add(Character.toLowerCase(s1.charAt(i)));
            }
        }
        
        int j = 0;
        int k = 0;
        
        
        // check if string is following the same sequence, from start point to end
        while (k < chars.size() && j < s1.length()) {

             if (Character.toLowerCase(s1.charAt(j)) != chars.get(k)) {
                return false;
            } else {
            	System.out.println(s1.charAt(j) + " = " + chars.get(k));
                j ++;
                k ++;
            }
        }
        
        // if both arraylist and string reach to end, return true, else return false
        if (k == chars.size() && j == s1.length()) {
        	System.out.println("True");
            return true;
        } else {
        	System.out.println("False");
            return false;
        }
        
        
    }

}
