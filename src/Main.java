public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKilo = 98;
        int index = service.calculate(weightInKilo, heightInMeters);
        System.out.println("Your body mass index: " + index);

    }
}