package Ex1006;

public class RandomNumGene implements NumberGene{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
