public class Class16
{
   public static void main(String args[])
   {
     String s="262904713";
     int n;
     n=Short.parseShort(s);
     System.out.println(n*2);
   }
}
//顯示Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
//            at java.base/java.lang.Short.parseShort(Short.java:132)
//            at java.base/java.lang.Short.parseShort(Short.java:156)
//            at Java12_16.Class16.main(Class16.java:8)
