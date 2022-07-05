public class HelloWorld
{
	public static void main(String[] args)
	{
		Hello hello = new Hello();

		hello.setReply("Hello World");

	 	for(int i =0; i < 10; i++)
		{
			System.out.println(hello.getReply());
		}
	}	
}
