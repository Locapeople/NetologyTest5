public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98;
        float h = 1.87F;
        int bmi = service.calculate(m, h);

        System.out.println(bmi);
    }
}