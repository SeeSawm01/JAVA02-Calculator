public class AdvancedCalculator extends Calculator {
    //부모 Calculator 자식 AdvancedCalculator  Cal에 있는걸 가져다 씀
    //+multiply() 는 멤버함수 이고 +는 public이란 뜻
    //상속에서 상위개념은 공통개념, 하위개념은 그 놈만 갖고있는것. 이걸 class diagram이라고 함. 구조화 는 객체지향의 기본
    @Override //부모랑 같은 이름이 있을시 이걸 사용하면 이것만 사용하게 됨
    public int multiply() {
        result = num1 * num2;
        return 0;
    }
    @Override
    public int divide() {
        result = num1 / num2;
        return 0;
    }

}
