package month2.week1.analysis;

public class Analysis {
    String productName;
    double moistureValue, maximumMoisture;
    int densityValue, maximumDensity;

    Analysis(String productName, double moistureValue, double maximumMoisture, int densityValue, int maximumDensity) {
        this.productName = productName;
        this.moistureValue = moistureValue;
        this.maximumMoisture = maximumMoisture;
        this.densityValue = densityValue;
        this.maximumDensity = maximumDensity;
    }

    void showData() {
        System.out.printf("Product name: %s%n", productName);
        System.out.printf("Moisture: %.2f%%%n", moistureValue);
        System.out.printf("Moisture Maximum Standard: %.2f%%%n", maximumMoisture);
        System.out.println("Density: " + densityValue + " g/L");
        System.out.println("Density Maximum Standard: " + maximumDensity + " g/L\n");
    }

}
