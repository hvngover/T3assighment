public class CurrencyConversionAdapter implements CurrencyConverter {
    private CurrencyConversionStrategy baseStrategy;

    public CurrencyConversionAdapter(CurrencyConversionStrategy baseStrategy) {
        this.baseStrategy = baseStrategy;
    }

    @Override
    public double convert(String sourceCurrency, String targetCurrency, double amount) {
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return baseStrategy.convert(amount);
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1 / baseStrategy.convert(1 / amount);
        } else {
            System.out.println("Unsupported currency conversion.");
            return -1;
        }
    }
}