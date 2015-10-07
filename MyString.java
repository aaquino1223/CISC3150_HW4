
//MyString class which imitates String class methods and functionality
public class MyString {
	private char[] string;
	
	//Parameters - char array chars
	//Constructor MyString copies values from chars into string
	public MyString(char[] chars) {
		this.string = new char[chars.length];
		
		for(int i = 0; i < chars.length; ++i) {
			this.string[i] = chars[i];
		}
	}
		
	//Parameters - int index
	//Method charAt returns char value of string at index
	public char charAt(int index) {
		return string[index];
	}
	
	//Method length returns length of char array string
	public int length() {
		return string.length;
	}
	
	//Parameters - int begin, int end
	//Method substring creates a char array from the subarray of string
	//starting at position begin and ending at position end - 1
	//Returns new MyString object
	public MyString substring(int begin, int end) {
		char[] string = new char[end - begin];
		
		int j = 0;
		for(int i = begin; i < end; ++i) {
			string[j++] = this.string[i];
		}
			
		return new MyString(string);
	}
	
	//Method toLowerCase creates a char array of the lower case values
	//of this.string
	//Returns new MyString object
	public MyString toLowerCase() {
		char[] string = new char[this.string.length];
		
		for(int i = 0; i < string.length; ++i) {
			if(Character.isUpperCase(this.string[i])) {
				string[i] = Character.toLowerCase(this.string[i]);
			}
			else {
				string[i] = this.string[i];
			}
		}
		
		return new MyString(string);
	}
	
	//Method toUpperCase creates a char array of the upper case values
	//of this.string
	//Returns new MyString object
	public MyString toUpperCase() {
		char[] string = new char[this.string.length];
		
		for(int i = 0; i < string.length; ++i) {
			if(Character.isLowerCase(this.string[i])) {
				string[i] = Character.toUpperCase(this.string[i]);
			}
			else {
				string[i] = this.string[i];
			}
		}
		
		return new MyString(string);
	}
	
	//Parameters - MyString s
	//Method equals determines if the char array in this and s are equal
	//Returns false if not equal and true if equal
	public boolean equals(MyString s) {
		if(this.string.length != s.string.length) {
			return false;
		}
		
		for(int i = 0; i < this.string.length; ++i) {
			if(this.string[i] != s.string[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	//Method getMyString returns a new string with the same char array as 
	//this MyString
	public MyString getMyString() {
		return new MyString(this.string);
	}
	
	//Method toString returns a new String from the char array string
	public String toString() {
		return new String(this.string);
	}
	
	//Parameters - int i
	//Method valueOf returns a new MyString objects with the char array
	//value of i
	public static MyString valueOf(int i) {
		return new MyString(Integer.toString(i).toCharArray());
	}
}