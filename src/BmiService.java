public class BmiService {
    public int calculate(int m, float h) {
        int result = (int)(m/(h*h));
        return result;
    }
}
