import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    AdvancedCalculator advancedCalc; //이 클래스 멤버변수를 모든 변수에서 사용 가능하게끔 생성
//CalculatorTest와 다른점 여기가 더 나은 방식 이전에는 객체 선언, 생성을 같이함 지금은 분리해서 작성함
    @BeforeEach //setUP을 사용함으로써 객체 선언을 미리 할 수 있음. 4줄이 2줄로 축소됌.
    void setUp() { //setUP은 공통되면서 초기화하는 메소드를 넣어주면 좋음.
        advancedCalc = new AdvancedCalculator();
        advancedCalc.setNumbers(9, 3);//num1 은 9 num2는 3 대입됨

    }

    @Test
    void multiply() {
        assertEquals(27, advancedCalc.multiply()); //예상값과 출력값이 같은지 비교하는 행위
    }

    @Test
    void divide() {
        assertEquals(3, advancedCalc.divide());
    }
}