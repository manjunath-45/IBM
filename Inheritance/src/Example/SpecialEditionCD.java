package Example;

public class SpecialEditionCD  extends CD{
 
	    private String features;

	    // Setter method
	    public void setFeatures(String features) {
	        this.features = features;
	    }

	    // Method to get special edition CD details
	    public String getDetails() {
	        return getCDDetails() + "\nFeatures: " + features;
	    }
	
}
