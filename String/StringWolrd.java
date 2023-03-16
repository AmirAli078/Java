import java.util.Arrays;
import java.util.Scanner;
public class StringWolrd{
	String s;
	String s2;
	public void reverseText(String s) {
		int length= s.length();
		String rev="";
		for(int i=length-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Revere text is: "+rev);
		
	}
	public void checkPalindrome(String s) {
		int length= s.length();
		String rev="";
		for(int i=length-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a Palindrome");
		}
	}
	public void checkAnagram(String s, String s2) {
		int n1=s.length();
		int n2=s2.length();
		s=s.toLowerCase();
		s2=s2.toLowerCase();
		if(n1==n2) {
			char[] text1=s.toCharArray();
			char[] text2=s2.toCharArray();
			Arrays.sort(text1);
			Arrays.sort(text2);
		if(Arrays.equals(text1, text2)){
			System.out.println(s+" And "+s2+" is Anagram");
		}
		else {
			System.out.println(s+" And "+s2+" is not Anagram");
		}
		}
		else {
			System.out.println(s+" And "+s2+" is not Anagram");
		}
	}
	public void diagnoss(String s) {
		int size=s.length();
		int vowels=0;
		int consonant=0;
		int space=0;
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}
			else if(ch>='a' && ch<='z') {
				consonant++;
			}
			else if(ch==' ') {
				space++;
			}
		}
		System.out.println("No of Vowels: "+vowels);
		System.out.println("No of Consonants: "+consonant);
		System.out.println("No spaces in text: "+space);
		System.out.println("size of the String is: "+size);
		
	}
	public void frequencyOfLetters(String s,char ch) {
		int frequency=0;
		for(int i=0; i<s.length(); i++) {
			if(ch==s.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("Frequency of "+ch+" = "+frequency);
	}
	  
	public static void main(String[] args) {
		String s;
		char ch;
		String s2;
		int choice;
		System.out.println("Select the Operation you wanted to Perform: ");
		System.out.println(" 1:Reverse a string \n 2:Check Palidrome \n 3:Check Anagram \n 4:Diagnoss string \n 5: Check the frequency of Letters");
		Scanner sc=new Scanner(System.in);
		StringWolrd r=new StringWolrd();
		System.out.print("enter the Choice: ");
		choice=sc.nextInt();
		sc.nextLine();
        //choice=Integer.parseInt(sc.nextLine());      
		if(choice==1) {
			System.out.print(" enter the text: ");
			s=sc.nextLine();
			r.reverseText(s);
		}
		else if(choice==2) {
			System.out.print("enter the text: ");
			s=sc.nextLine();
			r.checkPalindrome(s);
		}
		else if(choice==3) {
			System.out.print("enter the text: ");
			s=sc.nextLine();
		    System.out.print("enter the Text 2: ");
			s2=sc.nextLine();
			r.checkAnagram(s, s2);
		}
		else if(choice==4) {
			System.out.print("enter the text: ");
			s=sc.nextLine();
			r.diagnoss(s);
		}
		else if(choice==5) 
		{
			System.out.print("enter the text: ");
			s=sc.nextLine();
			System.out.print("enter the character you wants to know the frequency: ");
			ch=sc.nextLine().charAt(0);
			r.frequencyOfLetters(s, ch);
		}
		else {
			System.out.println("Invalid Operation or text");
		}	
		
	} 
}
