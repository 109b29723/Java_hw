// app13_8
class CCircleException extends Exception
{
}

class RadiusTooLarge extends Exception
{

}

class CCircle
{
    private double radius;
    public void setRadius(double r) throws CCircleException,RadiusTooLarge
    {
        if(r<0)
        {
            throw new CCircleException();
        }
        else
            radius=r;
        if(r>100)
        {
            throw new RadiusTooLarge();
        }
        else
            radius=r;
    }

    public void show()
    {
        System.out.println("area="+3.14*radius*radius);
    }
}
public class Class10 {
    public static void main(String args[])
    {
        CCircle cir=new CCircle();
        try
        {
            cir.setRadius(-2.0);
        }
        catch(CCircleException e)
        {
            System.out.println(e+" throwed");
        }
        catch(RadiusTooLarge e)
        {
            System.out.println(e+" throwed");
        }
        cir.show();
    }
}
