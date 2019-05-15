import java.util.*;
public class reverstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javatutorials";
		String rev="";
		System.out.println("Actual String is:- "+s);
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is :- " +rev);

	}

}
