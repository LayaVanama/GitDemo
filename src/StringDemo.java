
public class StringDemo {

	public static void main(java.lang.String[] args) {
	
		String a="javatraining";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3, 9));
		System.out.println(a.concat("got placed"));
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[] =a.split("t");
		System.out.println(arr[0]);System.out.println(a.replace("t", "s"));
		

	}

}
