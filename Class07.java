class math
{
   public static void power(int x,int n)
   {
      int sum=1;
      for(int i=1;i<=n;i++)
         sum*=x;
      System.out.println(x+"的"+n+"次方="+sum);
   }
}

public class Class07
{
   public static void main(String args[])
   {
      math.power(2,5);
      math.power(3,2);
   }
}
