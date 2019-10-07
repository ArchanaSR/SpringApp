//To learn - Single dimensional Array and String 

public class Products {
	String pr="Keyboard";
	int j=10;
	
	public void printProducts()
	{
	//declare an array of products
	String [] products1;//declare
	products1=new String[3];//Instantiate
	products1[0]="Monitor";
	products1[1]="Mouse";
	products1[2]=pr;
	
	for(int i=0;i<products1.length;i++)
	{
		System.out.println( products1[i] );
	}
	}
	public static void main(String args[])
	{
		Products prod=new Products();
		prod.printProducts();
		prod.Loopdemo();
		prod.varArg(1,2,3);
		prod.varArg(3,4,5,6);
	}
	public void Loopdemo()
	{
		int []ar={10,20,30,40};
		for(int i:ar)
		{
			System.out.println(i);
		}		
		//same can be used with string
		String []str={ "ABC","DEFG","HIJKL"};
		for(String s:str)
		{
		   System.out.println(s);	
		}		
	}
	//function with variable no of arguments
	public void varArg(int ... num)
	{
		 for(int i:num)
		 {
			 System.out.println(i);
		 }
 	}
	
	
}
