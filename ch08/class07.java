package Java08;
class CTest
{
	String test(int x){
		if(x%2==0) {
			return "此數為偶數";
		}
		else {
			return "此數為奇數";
		}
	}
}
public class Class07 {

	public static void main(String[] args) {
		CTest ctest = new CTest();
		System.out.println(ctest.test(3));
		System.out.println(ctest.test(8));
		System.out.println(ctest.test(0));
	}

}
