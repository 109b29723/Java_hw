package Java10;
class Car
{
	protected String owner;
	protected String id;
	
	final void show()
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
	}
	public void CRectangle(String own, String s)
	{
		owner = own;
		id = s;
	}
}
class CColor extends Car
{
	public String color;
	public CColor(String own, String s,String c)
	{
		super.CRectangle(own,s);
		color = c;
	}
	//public void show()	//(e)因為父類別show()用了中止繼承，所以這裡的show()不能使用
	//
	//	System.out.println("車主姓名:"+owner);
	//	System.out.println("車牌號碼:"+id);
	//	System.out.println("車身顏色:"+color);
	//}
	public void show2()		//(e)所以改成show2的名稱
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
public class Class17 {
	public static void main(String[] args) {
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show2();
	}
}
