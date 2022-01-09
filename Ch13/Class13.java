import java.util.*;
class Exception520 extends StringIndexOutOfBoundsException
{
}

class a
{
    private String str;
    public void set(String s) throws Exception520
    {
        if(s!="520")
        {
            str = s;
            System.out.println("String="+str);
        }
        else
        {
            throw new Exception520();
        }
    }
    public void show()
    {
    }
}
public class Class13 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        a b = new a();
        try
        {
            b.set(string);
        }
        catch(Exception520 e)
        {
            System.out.println("這是由字串520所引起的例外");
        }
    }
}
