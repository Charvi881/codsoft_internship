import java.util.Scanner;

public class currcon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String baseCurrency = "USD";
        String targetCurrency = "EUR";
        double exchangeRate = 0.85; 
        
        System.out.println("Welcome to the Currency Converter!");
       
        System.out.println("Enter the base currency (e.g., USD):");
        baseCurrency = scanner.nextLine();
        
        System.out.println("Enter the target currency (e.g., EUR):");
        targetCurrency = scanner.nextLine();
        
        
        System.out.println("Enter the amount in " + baseCurrency + " you want to convert:");
        double amount = scanner.nextDouble();
        
        
        double convertedAmount = amount * exchangeRate; // This calculation should use real-time rates
        
       
        System.out.println(amount + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        
        scanner.close();
    }
}
