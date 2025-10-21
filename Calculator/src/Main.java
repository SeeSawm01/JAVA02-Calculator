//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();

        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        //setNumbers 랑 displayResult 는 있으니 add 라인만 짜면 됨
        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(10, 20);
        calc_sub.subtract();
        calc_sub.displayResult("-");

//        Calculator calc_mul = new Calculator();
//        calc_mul.setNumbers(5, 3);
//        calc_mul.multiply();
//        calc_mul.displayResult("*");
//
//        Calculator calc_div = new Calculator();
//        calc_div.setNumbers(10, 2);
//        calc_div.divide();
//        calc_div.displayResult("/");

        ScientificCalculator sci_calc = new ScientificCalculator();

        sci_calc.setNumbers(3, 2); // 3^2
        sci_calc.power(); // power() 실행
        sci_calc.displayResult("^");
    }

}