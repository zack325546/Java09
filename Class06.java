class CAdd
{
   public static void add2n(int n)
   {
      int sum=0;
      for(int i=1;i<=n;i++)
         sum+=i;
      System.out.println("1+2+...+"+n+"="+sum);
   }
}
public class TESTB
{
   public static void main(String args[])
   {
	   CAdd.add2n(5);
	   CAdd.add2n(10);  
   }
}
