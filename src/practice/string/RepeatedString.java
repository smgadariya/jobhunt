package practice.string;

public class RepeatedString {

	public static void main(String[] args) {
		RepeatedString obj= new RepeatedString();
		System.out.println(obj.repeatedString("aba", 10));

	}
	 long repeatedString(String s, long n) {
		 long count =0;
		 char[] a1 = s.toCharArray();
		 
		 for(char a: a1) {
			 if(a=='a') count++;
		 }
		 
		 count = count * (n/s.length());
		 
		 for(int i= 0; i<n%s.length();i++) {
			 if(a1[i]=='a') count++;
		 }

		 return count;

    }

}
