import java.util.Scanner;

public class SmartTravelForex {

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */

        static final double JPY = 0.67;
        static final double EUR = 85.37;
        static final double GBP = 94.5;
        static final double USD = 74.3;
        static final double AED = 20.25;
    public static double currentExchangeRates(double amount, int choice) {
                if(amount<0)
                {
                        return -1;
                }
                else
                {
        double newAmount=0;
                switch(choice){
                case 1:
                newAmount= amount*JPY;
                break;
                case 2:
                newAmount= amount*EUR;
                break;
                case 3:
                newAmount= amount*GBP;
                break;
                case 4:
                newAmount= amount*USD;
                break;
                case 5:
                newAmount= amount*AED;
                break;
                }
                return newAmount;
                }
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
    //       double ind=currentExchangeRates(amountToBeConverted,sourceCurrency);
                  // double changed=currentExchangeRates(ind,targetCurrency);
                  // return changed;
                  if(sourceCurrency==targetCurrency)
                  {
                          return -1;
                  }
                  else{

                 double ind=0;
                 double changed=0;
                switch(sourceCurrency){
                case 1:
                ind= amountToBeConverted*JPY;
                break;
                case 2:
                ind= amountToBeConverted*EUR;
                break;
                case 3:
                ind= amountToBeConverted*GBP;
                break;
                case 4:
                ind= amountToBeConverted*USD;
                break;
                case 5:
                ind= amountToBeConverted*AED;
                break;
                }

                switch(targetCurrency){
                case 1:
                changed= ind/JPY;
                break;
                case 2:
                changed= ind/EUR;
                break;
                case 3:
                changed= ind/GBP;
                break;
                case 4:
                changed= ind/USD;
                break;
                case 5:
                changed= ind/AED;
                break;
                }
                return changed;
                  }
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
                        System.out.println("          1       10       20       50       100");
                        System.out.println("JPY       0.67    6.7      13.4     33.5     67.0");
                        System.out.println("EUR       85.37   853.7    1707.4   4268.5   8537.0");
                        System.out.println("GBP       94.5    954.0    1890.0   4725.0   9450.0");
                        System.out.println("USD       74.3    743.0    1486.0   3715.0   7430.0");
                        System.out.println("AED       20.25   202.5    405.0    1012.5   2025.0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = sc.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = sc.nextInt();
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = sc.nextInt();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }
}

