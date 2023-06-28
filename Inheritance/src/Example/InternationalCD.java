package Example;

class InternationalCD extends CD {
    private String language;

    // Setter method
    public void setLanguage(String language) {
        this.language = language;
    }

    // Method to get international CD details
    public String getDetails() {
        return getCDDetails() + "\nLanguage: " + language;
    }
}