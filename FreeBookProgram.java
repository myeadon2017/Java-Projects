
import java.util.Scanner;


//This program calculates the price of the books sold, and displays a receipt of this information to the customer

public class FreeBookProgram {
    
//This method prompts the users input and then calculates

public static void main(String[] args) {
    //Declare variables
    String sName = "";
    int nTypeOfCustomer = 0;
    int nHowMuchBooksPurchased = 0;
    int nBooksRecieved = 0;
    double dSalesTax = 0.0;
    double dSellingPrice = 0.0;
    double dTotalAmountDue = 0.0;
    Scanner input = new Scanner(System.in);
    
    //Declare Constants
    final double REG_PRICE_OF_BOOK = 12.95;
    final double PRE_PRICE_OF_BOOK = 11.49;
    final double TAX_RATE = .065;
    
    
    //Prompt user to enter his or her name
    System.out.print("Please enter your name: ");
    
    //Read name of user
    sName = input.nextLine();
    
    //Prompt user to enter how many books purchased
    System.out.print("How many books did you purchase: ");
    
    //Read number of books purchased
    nHowMuchBooksPurchased = input.nextInt();
    
    //Prompt user to enter what type of customer they are
    System.out.print("What type of customer are you? Enter 1 for Regular or 2 for Premium: ");
    
    //Read what kind of customer they are
    nTypeOfCustomer = input.nextInt();
    
    //Giving some space in the program
    System.out.println("");
    
    //Read Purchase Summary
    System.out.println("PURCHASE SUMMARY");

    //Read the customers name
    System.out.println("Customer's name: " + sName);
    
    //Selection of what type of customer he or she is
    if(nTypeOfCustomer == 1)
        System.out.println("Customer type: Regular");
    else if (nTypeOfCustomer == 2)
        System.out.println("Customer type: Premium");
    
    //Calculating total books recieved if purchasing 8 with regular member
    if(nTypeOfCustomer ==1)
      nBooksRecieved = nHowMuchBooksPurchased;
      if(nHowMuchBooksPurchased == 8) {
       nBooksRecieved = nHowMuchBooksPurchased + 1;   
      } 
    //Calculating total books received if purchasing 9
      else if(nHowMuchBooksPurchased == 9) { 
          nBooksRecieved = nHowMuchBooksPurchased + 1;}
      
    //Calculating total books recieved if purchasing 10
      else if(nHowMuchBooksPurchased == 10) {
          nBooksRecieved = nHowMuchBooksPurchased +1;
      } 
    //Calculating total books recieved  if purchasing 11
      else if(nHowMuchBooksPurchased == 11) {
          nBooksRecieved = nHowMuchBooksPurchased +1;
      } 
    //Calculating total books recieved  if purchasing more then 12
      else if(nHowMuchBooksPurchased > 12) {
          nBooksRecieved = nHowMuchBooksPurchased +2;
      } 
    //Calculating total books recieved if purchasing 6 with premium member
      if(nTypeOfCustomer ==2)
          nBooksRecieved = nHowMuchBooksPurchased;
      if(nHowMuchBooksPurchased ==6) {
          nBooksRecieved = nHowMuchBooksPurchased + 1;
      } 
    //Calculating total books received if purchasing 7
      else if(nHowMuchBooksPurchased ==7) {
        nBooksRecieved = nHowMuchBooksPurchased + 1;  
      } 
    //Calculating total books received if purchasing 8
      else if(nHowMuchBooksPurchased ==8) {
        nBooksRecieved = nHowMuchBooksPurchased + 1;  
      } 
    //Calculating total books received if purchasing more then 9
      else if(nHowMuchBooksPurchased > 9) {
        nBooksRecieved = nHowMuchBooksPurchased + 2;  
      }
      //Read how many books are recieved
      System.out.println("Total books recieved: " + nBooksRecieved );
      
      if(nTypeOfCustomer ==1) { 
       dSellingPrice = REG_PRICE_OF_BOOK * nHowMuchBooksPurchased;  
      } 
    //Calculating if books are purchased with premium membership
      else if(nTypeOfCustomer ==2) {
       dSellingPrice = PRE_PRICE_OF_BOOK * nHowMuchBooksPurchased;
      }
    //Read price of books
    System.out.println("Selling price: " + dSellingPrice);
    
    //Sales tax of selling price for non members
    if(nTypeOfCustomer == 1) {
     dSalesTax = dSellingPrice * TAX_RATE; 
    }
    //Sales tax for premium members
    else if(nTypeOfCustomer == 2) {
       dSalesTax = dSellingPrice * TAX_RATE; 
    }
    //Read the sales tax
    System.out.println("Sales tax: " + dSalesTax);
    
    //Getting the grand total
    dTotalAmountDue = dSalesTax + dSellingPrice;
    
    //Read the grand total
    System.out.println("Total amount due: " + dTotalAmountDue);
      
    
        
        
    
    
    
    
        
    
    
    

}   //End of main class
    



}   //End of free book program
