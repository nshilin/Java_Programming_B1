package day25_methods;
/*create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

        1 dollar = 0.91 euro
        1 dollar = 121.03 yen
        1 dollar = 14.85 lira
        1 dollar = 1,217.52 won
        1 dollar = 181.45 rupee*/
public class CurrencyConverter {

        public static double currency(String currencyType, double currencyAmount) {

            switch (currencyType.toLowerCase()) {
                case "euro":
                    return currencyAmount *= 0.91;
                case "yen":
                    return currencyAmount *= 121.03;
                case "lira":
                    return currencyAmount * 14.85;
                case "won":
                    return currencyAmount * 1217.52;
                case "rupee":
                    return currencyAmount * 181.45;
                default:
                    System.out.println("Invalid currency");
                    return 0.0;
            }
        }

        public static void main(String[] args) {
            System.out.println("Your converted currency: " + currency("yen", 100.0));
        }
    }

