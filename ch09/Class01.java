package Java09;
class CRectangle
{
    int width;
    int heigh;
    public CRectangle(int w, int h)
    {
        width = w;
        heigh = h;
    }
    public CRectangle() 
    {
        this(8,10); //(c)
        width = 8;  //(b)
        heigh = 10; //(b)
    }
    public void show()
    {
        System.out.println(width+","+heigh);
    }
}
public class Class01
{
   public static void main(String args[])
   {
       CRectangle cr = new CRectangle();
       cr.show();
   }
}
