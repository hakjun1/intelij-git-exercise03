package CalculatorPratice;

public class RandomNumberMaker implements Numbermaker{

    @Override
    public int make(int num) {
        return (int) (Math.random() * num);
    }

}

