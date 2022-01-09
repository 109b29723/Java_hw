class CTest implements Runnable
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
            try
            {
                Thread.sleep((int)(2000*Math.random()));
            }
            catch(InterruptedException e){}
            System.out.println(id+" "+i);
        }
    }
}

public class Class10
{
    public static void main(String args[])
    {
        CTest hi=new CTest("Hello");
        CTest bye=new CTest("Good bye");
        CTest morning=new CTest("Good morning");
        CTest night=new CTest("Good night");
        Thread a=new Thread(hi);
        Thread b=new Thread(bye);
        Thread c=new Thread(morning);
        Thread d=new Thread(night);
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
