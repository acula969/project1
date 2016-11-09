package proj0911;

public class classs {
public static void main (String[] args) {
	String a;
	a = "Hello world!";
	char b;
	b= '1';
	
	int i = a.indexOf(b);
	System.out.println(i);
	
	int j=a.length();
	System.out.println(j);
	
	char c = a.charAt(1);
	System.out.println(c);
	
	String a1;
	String a2;
	a1 = a.replace('1', 'p');
	System.out.println(a1);
	
	a1 = a.toLowerCase();
	a2 = a.toUpperCase();
	//a = a1 +a2;
	int f = a.compareTo("Hello");
	
	String a3;
	
	a3=a.substring(3,9);
	System.out.println(a3);
	
	a3 = a.trim();
	System.out.println(a3);
	
}
}
