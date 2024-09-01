import com.zubair.jdk18.codesnippet.external.Calculator;

public class CalculatorExample {

    public static void main(String[] args) {

        // @start region="binary"
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        System.out.println(sum);  // Output: 8
        // @end region="binary"
    }


}