package Java08;
class CSphere
{
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation() {
		x = 3;
		y = 4;
		z = 5;
	}
	void setRadius() {
		radius = 1;
	}
	double surfaceArea() {
		return radius*radius*3.14;
	}
	double volume() {
		return radius*radius*radius*3.14*4/3;
	}
	String showCenter() {
		return "("+x+","+y+","+z+")";
	}
}
public class Class16 {

	public static void main(String[] args) {
		CSphere cs= new CSphere();
		cs.setLocation();
		cs.setRadius();
		System.out.println(cs.surfaceArea());
		System.out.println(cs.volume());
		System.out.println(cs.showCenter());
	}

}
