package Java10_2;
import Java10.Caaa;
import Java10.Cbbb;

class Caaa
{
	public int num1;
	public int num2;
	public Caaa()
	{
		num1 = 1;
		num2 = 1;
	}
	public Caaa(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
}
class Cbbb extends Caaa
{
	public Cbbb()
	{}
	public void set_num(int n1,int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	public Cbbb(int a,int b)
	{
		super(a, b);
	}
	public void show()
	{
		System.out.println("num1="+num1+",num2="+num2);
	}
}
public class Class03 {
	public static void main(String[] args) {
		Cbbb bb=new Cbbb();
		bb.show();
		Cbbb bb1=new Cbbb(2,3);
		bb1.show();

	}
}
