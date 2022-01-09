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
public class Class02
{
    public static void main(String args[])
    {
        CTest hi = new CTest("Hello");
        hi.run();
        CTest bye = new CTest("Good bye");
        bye.run();
    }
}
//(d)
//Hello 1
//Hello 2
//Hello 3
//Hello 4
//Hello 5
//Good bye 1
//Good bye 2
//Good bye 3
//Good bye 4
//Good bye 5

//Hello跑5遍，接著換Good bye跑5遍
