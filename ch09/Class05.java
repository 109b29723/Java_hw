package Java09;
class CCount 
{
    int cnt = 0;
    public void count()
    {
        cnt+=1;
    }
    public CCount()
    {
        count();
    }
    public void setZero()
    {
        cnt = 0;
    }
    public void setValue(int n)
    {
        cnt = n;
    }
}
public class Class05 {
    public static void main(String args[])
    {
        CCount cc=new CCount();         //(a)呼叫1次                   //
        System.out.println(cc.cnt);     //(a)輸出 1
        cc.setZero();                   //(b)呼叫setZero()，值歸零
        System.out.println(cc.cnt);     //(b)輸出 0
        cc.setValue(3);                 //(c)呼叫setValue，值為n(輸入3)
        System.out.println(cc.cnt);     //(c)輸出 3
    }
}
//(d)類別變數，所有物件都能共享
//(e)類別函數
