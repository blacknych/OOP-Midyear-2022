public class HelloWorld
{
	public static void main(String[] args)
	{
		Hello hello = new Hello();

		hello.setReply("Hello World");

		System.out.println(hello.getReply());
	}
}