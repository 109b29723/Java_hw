package Java10;
class CTriangle
{
	protected int base;
	protected int height;
	
	protected void show()
	{
		System.out.println("base="+base+", height="+height);
		System.out.println("area="+(float)(base*height/2));
	}
	public CTriangle(int b,int h)
	{
		base=b;
		height=h;
	}
}
class CData extends CTriangle
{
	public CData(int b,int h)
	{
		super(b,h);
	}
	public void area()
	{
		show();
	}
}
public class Class06 {
	public static void main(String[] args) {
		CData obj=new CData(3,8);
		obj.area();
	}
}
