
//Homework 4
//Tester for MyString class
public class MyStringDriver {
	public static void main(String[] args) {
		char[] chars = new char[] {'A', 'l', 'e', 'x'};
		
		System.out.println("----Testing Constructor and toString method----");
		MyString myString = new MyString(chars);
		System.out.println("myString - " + myString.toString());
		
		System.out.println("\n----Testing length and charAt methods----");
		for(int i = 0; i < myString.length(); ++i) {
			System.out.println(myString.charAt(i));
		}
		
		System.out.println("\n----Testing substring method----");
		MyString myString2 = myString.substring(0, 2);
		System.out.println(myString2.toString());
		
		System.out.println("\n----Testing toLowerCase and toUpperCase methods----");
		System.out.println(myString.toLowerCase().toString());
		System.out.println(myString.toUpperCase().toString());
		
		System.out.println("\n----Testing equals and getMyString methods----");
		if(!myString.equals(myString2)) {
			System.out.println("myString(" + myString.toString()
				+ ") is not the same as myString2(" + myString2.toString() + ")");
		}
		
		myString2 = myString.getMyString();
		
		if(myString.equals(myString2)) {
			System.out.println("myString(" + myString.toString() 
				+ ") is the same as myString2(" + myString2.toString() + ")");
		}
		
		System.out.println("\n----Testing valueOf method----");
		for(int i = 0; i < 21; ++i) {
			System.out.print(MyString.valueOf(i).toString() + " ");
		}
	}
}