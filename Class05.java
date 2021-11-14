class CCount//(a)                 
{
   private static int cnt=0;   //(d)應利用類別變數,這樣底下的函數才可以存取cnt

   public CCount()      
   {
      count();                        
   }
   public static void count() //(e)兩者都可
    {
       cnt++;
    }
   public static void setZero() //(b)          
   {
	   cnt=0;              
   }
  
   public static void setValue(int n) //(c)     
   {
      cnt=n;                        
   }
   public static void show()  
   {
      System.out.println("cnt="+cnt);
   }
}
public class TESTB
{
   public static void main(String args[])
   {
	   CCount cn1=new CCount();
	   CCount cn2=new CCount();
	   CCount.show();
	   
	   CCount.setZero();
	   System.out.println("using setZero()...");
	   CCount.show();

	   CCount.setValue(10);
	   System.out.println("using setValue(10)...");
	   CCount.show();
   }
}
