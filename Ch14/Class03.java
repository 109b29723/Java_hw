import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Class03
{
   public static void main(String args[]) throws IOException
   {
      BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
      int n,sum=0;
      String str=bu.readLine();
      n=Integer.parseInt(str);

      for(int i=1;i<=n;i++)
      {
          sum+=i;
      } 
      System.out.println("1+2+...+"+n+"="+sum);
   }
}
