public class RandomCalculator {

    public int randomNum() {
        int num = (int)(Math.random()*100);
        return num;
    }

    public void plus(int a) {
        System.out.println(a + randomNum());
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