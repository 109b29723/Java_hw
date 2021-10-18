package Java08;
class CBox
{
	int length;
	int width;
	int height;
	int volume()
	{
		return length*width*height;
	}
	int surfaceArea()
	{
		return (length*width+width*height+length*height)*2;
	}
	String showData()
	{
		return "length:"+length+" width:"+width+" height:"+height;
	}
	String showAll()
	{
		return "length:"+length+" width:"+width+" height:"+height+" surfaceArea:"+surfaceArea()+" volume:"+volume();
	}
}
public class Class05 {

	public static void main(String[] args) {
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		System.out.println(box.showData());
		System.out.println(box.showAll());
	}

}
