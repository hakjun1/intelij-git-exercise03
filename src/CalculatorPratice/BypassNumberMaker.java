package CalculatorPratice;

public class BypassNumberMaker implements Numbermaker{
    @Override
    public int make(int num) {
        return num;//받은거 그대로 리턴
    }
}
