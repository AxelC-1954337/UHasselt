package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, world"+ "\n");
		String file = args[args.length-1];
		String[] values = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			values[i] = (args[i]);
		}
		System.out.println(file + "\n");
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

	}

}
