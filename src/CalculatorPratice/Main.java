package CalculatorPratice;

public class Main {
    public static void main(String[] args) {
        Numbermaker numbermaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numbermaker);
        randomNumberCalculator.plus(20);
        //선언을 하지않고 한번에 표현
        Calculator byPassNumberCalculator = new Calculator(new BypassNumberMaker(),200);
        byPassNumberCalculator.plus(50);
    }
}
