package intro_to_java;
public class Stock {
    private String tickerSymbol;
    private String companyName;
    private double price;
    private double percentChange;
    private int totalShares;

    // Constructor
    public Stock(String tickerSymbol, String companyName, double price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase(); // Convert to uppercase
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0; // Default percentChange is 0
    }

    // Method to adjust the price of the stock by a percent
    public void adjustPrice(int change) {
        // Update the price and recalculate percentChange
        price += change;
        percentChange = ((price - (price - change)) / (price - change)) * 100; // Calculate percentChange correctly
    }

    // Calculate market cap by multiplying total shares by price and removing the last three zeros
    private String calculateMarketCap() {
        long cap = (long) (totalShares * price) / 1000; // Remove the last three zeros
        return "$" + cap;
    }

    // Method to represent the Stock object as a string
    @Override
    public String toString() {
        // Format the price as an integer
        String formattedPrice = String.format("$%,d", (int) price);
        
        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: " + formattedPrice + " (" + percentChange + "%)\n" +
               "Market Cap: " + calculateMarketCap();
    }

    public static void main(String[] args) {
        // Create a Stock object
        Stock googStock = new Stock("GOOG", "Google, Inc.", 802.0, 6700000);

        // Display the initial stock information
        System.out.println(googStock);

        // Adjust the price of the stock
        googStock.adjustPrice(20);

        // Display the updated stock information
        System.out.println(googStock);
    }
}
