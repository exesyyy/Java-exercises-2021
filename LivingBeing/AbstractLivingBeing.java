package LivingBeing;

abstract public class AbstractLivingBeing {

    private int age;

    /**
     * Height is expressed by cm
     */
    private int height;

    /**
     * Weight is expressed by KGs
     */
    private int weight;


    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    abstract public String born();
    abstract public String die();
}
