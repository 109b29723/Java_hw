class CTest extends Thread
{
    public String id;
    public CTest(String str)
    {
        id=str;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<100000000;j++);
            System.out.println(id+" "+i);
        }
    }
}
public class Class03
{
    public static void main(String args[])
    {
        CTest hi = new CTest("Hello");
        hi.start();
        CTest bye = new CTest("Good bye");
        bye.start();
    }
}
