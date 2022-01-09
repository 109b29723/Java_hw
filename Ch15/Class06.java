class Add implements Runnable
{
    private int n;
    private int sum=0;
    public Add(int a)
    {
        n=a;
    }
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<100000000;j++);
            sum+=i;
        }
        System.out.println("1+2+...+"+n+" = "+sum);
    }
}
public class Class06 {
    public static void main(String args[])
    {
        Add a=new Add(5);
        Thread c=new Thread(a);
        c.start();
        Add b=new Add(10);
        Thread d=new Thread(b);
        d.start();
    }
}
