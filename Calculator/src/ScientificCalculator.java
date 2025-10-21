public class ScientificCalculator extends AdvancedCalculator {


    public int power() {
        result = (int) Math.pow(num1, num2);
        return result;
    }

    public double sqrt() {
        double resultDouble = Math.sqrt(num1);

        // result는 int라서 반올림하여 저장
        result = (int) Math.round(resultDouble);

        return resultDouble;
    }
}
