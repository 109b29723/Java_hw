package Java09;
class math
{
    public void power(int x,int n)
    {
        long sum = 1;
        for(int i=0;i<n;i++){
            sum*=x;
        }
        System.out.println(x+"的"+n+"次方="+sum);
    }
}
public class Class07 {
    public static void main(String args[])
    {
        math m = new math();
        m.power(2*2*2*2*2,3*3); //2的5次的3的2次方
        m.power(2,5);           //2的5次方
        m.power(3,2);           //3的2次方
    }
}
