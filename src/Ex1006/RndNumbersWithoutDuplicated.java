package Ex1006;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumGene randomNumGene = new RandomNumGene();
        for(int i = 0;i<50;i++){ //0부터 50까지
            int r =randomNumGene.generate(10);
            //num에 10을 넣었으므로 10이하의 숫자
            System.out.println(r);
        }


    }
}
