// hw13_1, 例外訊息的擷取
public class Class02
{
    public static void main(String args[])
    {
        int num=12,den=0;
        if(den == 0){
            System.out.println("除數為0");
        }
        else{
            int ans=num/den;
        }
        System.out.println("end of main()!!");
    }
}
