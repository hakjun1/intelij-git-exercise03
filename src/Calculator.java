public class Calculator {
    private int a;
    private int b;

    public Calculator(int a,int b) {
        this.a =a;
        this.b =b;
    }

    public void plus(){
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void multiple(){
        System.out.println(a*b);
    }
    public void divide(){
        float result = a/(float)b;
        System.out.println(result);
    }


}
