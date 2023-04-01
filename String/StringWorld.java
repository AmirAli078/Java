import java.util.Scanner;
class StringWolrd{
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
		this.s=s;
		this.s2=s2;
		if(this.s.length()==this.s2.length()) {
       char a1[] = s.toCharArray();
       char a2[] = s2.toCharArray();
		for(int i = 0 ; i < s.length();i++)
 {
  for(int j = i+1 ; j< s.length();j++)
 {
      if(a1[i]>a1[j])
  {
 char temp = a1[i];
 a1[i] = a1[j];
 a1[j] = temp;
            }			
		}}
for(int i = 0 ; i < s2.length();i++)
    {
     for(int j = i+1; j< s2.length();j++)
  {
    if(a2[i] >a2[j])
     {
    char temp1 = a2[i];
    a2[i] = a2[j];
    a2[j] = temp1;
	}}}
String world1 = new String(s.toCharArray());
 String world2 = new String(s2.toCharArray());
    if(world1.equals(world2)){
    System.out.println(s+" And "+s2+" are Anagram");
   }
else{
  System.out.println(s+" And "+s2+" are Not Anagram");
  }
	}}
	
 public void diagnoss(String s) {
		int size=s.length();
		int consonant=0;
		int space=0;
		s=s.toLowerCase();
         String vowels = "aeiouAEIOU";
         String uniqueVowels = "";
          int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (vowels.indexOf(c) != -1 && uniqueVowels.indexOf(c) == -1) {
            uniqueVowels += c;
            count++;
        }
    }
         System.out.println(count);
}

	public void frequencyOfLetters(String s) {
		int[] freq = new int[26];
        s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {
			freq[c]++;
           // freq[c - 'a']++;
        }
    }
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            System.out.printf("%c: %d%n", 'a' + i, freq[i]);
        }
    }
}
	 
	public static void main(String[] args) {
		String s;
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
			r.frequencyOfLetters(s);
		}
		else {
			System.out.println("Invalid Operation or text");
		}	
		
	} 
}
