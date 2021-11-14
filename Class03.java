class Caaa{//(c)否,因為會與文件名衝突
	private int value;//(d)可以,不會有影響,因為其他的建構元會再對value做設定
	
	public Caaa(){
		value=10;//(a)
		System.out.println("value="+value);
	}
	public Caaa(int i){
		value=i;
		System.out.println("value="+value);
	}
}
public class Class03{
	public static void main(String args[]) {
		Caaa obj1=new Caaa();//(b)public Caaa()
		Caaa obj2=new Caaa(12);//(b)public Caaa(int i)
	}
}
