public class WeightHillPattern {
    public int totalHillWeight(int rows, int weight, int increment) {
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                sum += weight;
            }
            weight += increment;
        }
        return sum;
    }
}