package Java08;
public class Class02 {
	public static void main(String[] args) {
		Cbbb obj1 = new Cbbb();
		obj1.x = 5.2;
		obj1.y = 3.9;
		Cbbb obj2 = new Cbbb();
		obj2.x = 6.5;
		obj2.y = 4.6;
		Cbbb avg = new Cbbb();
		avg.x = (obj1.x + obj2.x)/2;
		avg.y = (obj1.y + obj2.y)/2;
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(avg.x);
		System.out.println(avg.y);
	}
}
class Cbbb
{
	double x;
	double y;
}
