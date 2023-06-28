package Example;

public class CD {
    private int cdId;
    private String cdName;
    private double cdPrice;

    // Setter methods
    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public void setCdPrice(double cdPrice) {
        this.cdPrice = cdPrice;
    }

    // Getter methods
    public int getCdId() {
        return cdId;
    }

    public String getCdName() {
        return cdName;
    }

    public double getCdPrice() {
        return cdPrice;
    }

    // Method to get CD details
    public String getCDDetails() {
        return "CD ID: " + cdId + "\nCD Name: " + cdName + "\nCD Price: $" + cdPrice;
    }
}