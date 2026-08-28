public class GroupO_BusinessSimulator {
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

  //DISCOUNTS
    if (fuel_item_qties[0] >= 20 ) {
      
      fuel_item_prices[0] = fuel_item_prices[0] - (fuel_item_prices[0] * 0.05) ;
      System.out.println("Petrol discount applied");
    }
    if (fuel_item_qties[2] >= 3 ) {
      fuel_item_prices[2] = fuel_item_prices[2] - 3000 ;
      System.out.println("Engine oil discount applied");
      }
    if (fuel_item_qties[3] >= 4) {
      fuel_item_prices[3] = fuel_item_prices[3] - (fuel_item_prices[3]* 0.1) ;
      System.out.println("Car wash discount applied!");
    }
    
 //SUBTOTALS (our math loop to calculate the subtotals first)
  int k = 0;
  double subtotal = 0;
  for (int qty : fuel_item_qties){
    subtotal += fuel_item_prices[k] * qty ; //we have the entire subtotal here just simply sitting
    k++;
  }
//RECEIPT CODE
System.out.println("==== RECEIPT ====");
int m = 0;
for(String item : fuel_items) {
  //here we want to only orint the items that the client bought
  if (fuel_item_qties[m] > 0 ){//here we only want to print what has actually been bought
    double itemTotal = fuel_item_prices[m] * fuel_item_qties[m] ; //we are making use of our global variables
    System.out.println(item + "  x" + fuel_item_qties[m] + " = UGX " + itemTotal ); // we need to output each subtotal then a grandtotal
  }  
  m++;
}  
     
System.out.println("-----------------------------------");
System.out.println("TOTAL      = UGX " + subtotal);
  }
}
