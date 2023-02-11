public class BmiService {
    public int calculate(int weight, double height) {
        double index;
        index = weight / (height * height);
        return (int) index;
    }
}



