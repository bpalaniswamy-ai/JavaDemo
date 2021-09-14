public class Source{
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int sub(int a, int b){
		return a-b;
	}
	
	public static int mul(int a, int b){
		return a*b;
	}
	
	public static int div(int a, int b){
		return a/b;
	}
	
	public static void main(String[] Args){
		int a = 30, b = 10;
		System.out.println(Source.add(a,b));	
		System.out.println(Source.sub(a,b));
		System.out.println(Source.mul(a,b));
		System.out.println(Source.div(a,b));
	}
}