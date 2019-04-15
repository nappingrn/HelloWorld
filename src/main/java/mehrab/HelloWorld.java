package mehrab;

class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		MyWorld myWorld = new MyWorld(args[0]);
		System.out.println(myWorld.toString());
	}
}