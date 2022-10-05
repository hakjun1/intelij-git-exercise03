public class RandomCalculator {

    public int randomNum() {
        int num = (int)(Math.random()*100);
        return num;//이 메서드를 호출하면 num값을 리턴한다
    }

    public void plus(int a) {
        System.out.println(a + randomNum());//클래스 내의 메서드 호출**
    }

    public void minus (int a) {
        System.out.println(a-randomNum());
    }

    public void multiple (int a) {
        System.out.println(a*randomNum());
    }

    public void divide (int a) {
        try {
            float result = ((float) a / randomNum());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("/zero");
        }
    }

}