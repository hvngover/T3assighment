public interface CurrencyConverter {
    double convert(String sourceCurrency, String targetCurrency, double amount);
}