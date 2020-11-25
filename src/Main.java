public class Main {
    public static void main(String[] args) {
        double weight = 78.5;
        double height = 1.78;
        BmiService service = new BmiService();
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
