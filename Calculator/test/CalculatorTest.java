import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    //테스트 대상은 add() 랑 {} 안에 넣으면 됨
    void add() {
        //테스트 Class 를 사용할려면 객체를 받아와야함. Test랑 다른 클래스이기 때문에 1. 객체생성
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20); //입력 메소드 테스트할때는 메인에서 넣은 값과 다른 값을 넣어주는게 좋음
        assertEquals(30, calc.add()); //앞의 내용은 테스트에서만 사용하는 용어. 30과 calc.add가 같냐고 물어봄
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(-10, calc.subtract());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(200, calc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(2, calc.divide());
    }
}