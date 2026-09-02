public class GroupO_BusinessSimulator {
// METHOD 1: this is working out the subtotals with the associated discount ruls
public static double getDiscountedSubtotal(String itemName, double price, int qty) {
  double finalPrice = price ;

  if (itemName.equals("Petrol (litre)") && qty >= 20 ) {  //.equalsIgnoreCase()
    finalPrice = price - (price * 0.05) ;
    System.out.println("Petrol Discount Applied");
  }
  if (itemName.equals("Engine Oil") && qty >= 3 ) {
    finalPrice = price - 3000;
    System.out.println("Engine oil Discount Applied");
  }
  if (itemName.equals("Car Wash") && qty >= 4 ) {
    finalPrice = price - (price * 0.1) ;
    System.out.println("Car wash Discount Applied");
  }

  return finalPrice * qty; //return's only one individual item's subtotal
}

//Method 2 : prints a single line of the receipt
  public static void printReceiptLine(String item, int qty, double itemTotal) {
    System.out.println(item + "  x" + qty + " = UGX " + itemTotal ); // we need to output each subtotal then a grandtotal
  }  

  public static void main(String[] args) {
    //POWER FUEL STATION
    String[] fuel_items = {"Petrol (litre)" , "Diesel (litre)" , "Engine Oil" ,"Car Wash"} ;
    double[] fuel_item_prices = {5000 , 4800, 25000 , 10000 } ; //we can improve this by using a two  dimensional array
    int i = 1;
    int j = 0;
  System.out.println("==== POWER FUEL STATION ====");
  for(String item : fuel_items) { //we can improve this by using a  continue statement to align te receipt or if conditions to fix the spacing(it can't be connstant)
    System.out.println(i + ". " + item + "      UGX" + fuel_item_prices[j]);
    i++;
    j++;
  }
  int[] fuel_item_qties = {19 , 2 , 2, 4} ; //each is in order of petrol,diesel,engineoil  and carwash
  //for future edits , make a for loop for quantities to be automatically filled into the array

  //we are now going to use our method  to work out the discounted subtotals
  int k = 0;
  double subtotal = 0;
  double[] itemTotals = new double[fuel_items.length] ; //this will store each item's final totsl to the receipt
  for (int qty : fuel_item_qties) {
    double itemTotal = getDiscountedSubtotal(fuel_items[k] , fuel_item_prices[k] , qty);
    itemTotals[k] = itemTotal;
    subtotal += itemTotal ;
    k++;
  }
//RECEIPT CODE
System.out.println("==== RECEIPT ====");
int m = 0;
for(String item : fuel_items) {
  //here we want to only orint the items that the client bought
  if (fuel_item_qties[m] > 0 ){//here we only want to print what has actually been bought
    printReceiptLine(item, fuel_item_qties[m], itemTotals[m]);
  }
  m++;
}
     
System.out.println("-----------------------------------");
System.out.println("TOTAL      = UGX " + subtotal);
  }
}
