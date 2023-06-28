package Example;

public class Tester {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.setCdId(1);
        cd.setCdName("Generic CD");
        cd.setCdPrice(9.99);

        SpecialEditionCD specialEditionCD = new SpecialEditionCD();
        specialEditionCD.setCdId(2);
        specialEditionCD.setCdName("Special Edition CD");
        specialEditionCD.setCdPrice(19.99);
        specialEditionCD.setFeatures("Bonus tracks");

        InternationalCD internationalCD = new InternationalCD();
        internationalCD.setCdId(3);
        internationalCD.setCdName("International CD");
        internationalCD.setCdPrice(14.99);
        internationalCD.setLanguage("English");

        System.out.println("CD Details:\n" + cd.getCDDetails());
        System.out.println("\nSpecial Edition CD Details:\n" + specialEditionCD.getDetails());
        System.out.println("\nInternational CD Details:\n" + internationalCD.getDetails());
    }
}