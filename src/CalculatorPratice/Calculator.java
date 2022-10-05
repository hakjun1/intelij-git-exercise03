package CalculatorPratice;

public class Calculator {
    //NumberMaker에서 만들어준 숫자를 가지고
    //사칙 연산한 결과를 출력한다


    private Numbermaker numbermaker;
    private int baseNum = 10;

    public Calculator(Numbermaker numbermaker) {
        this.numbermaker = numbermaker;
    }

    public Calculator(Numbermaker numbermaker, int baseNum) {//생성자 오버로딩
        this.numbermaker = numbermaker;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        int result = num + this.numbermaker.make(this.baseNum);//??
        System.out.println(result);

    }
}
