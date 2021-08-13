public class Shop
{
	int price;
	String brand;
	 static String shopName = "pandian Stores";
	 static int streetNo = 2;
public static void main(String[] args)
{
	Shop soap = new Shop();
	Shop biscuits = new Shop();
	
	Shop.offer();
	soap.price = 20;
	soap.brand = "ABC";
	biscuits.price = 10;
	biscuits.brand = "XYZ";
	
	biscuits.purchase();
	
	//System.out.println(Shop.shopName);
	//System.out.println(Shop.streetNo);
	
	//System.out.println(soap.brand);
	//System.out.println(soap.price);
	//System.out.println(biscuits.brand);
	//System.out.println(biscuits.price);


}
public void purchase()
{
	System.out.println(brand);
	System.out.println(price);
}
	
public static void offer()
{
	System.out.println("Flat 10% offer ");
}

}