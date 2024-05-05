package Helllo;

public class First implements AAO {
	public void show()
	{
		System.out.println("show");
	}
	public void run()
	{
		System.out.println("run");
		
	}
	public String good(String a)
	{
		return "abc";
	}
	public int fast()
	{
		return 10+30;
	}
	public static void main(String[]args)
	{
		First f=new First();
		f.show();
		f.run();
		System.out.println(f.good("a"));
		f.fast();
	}

}
