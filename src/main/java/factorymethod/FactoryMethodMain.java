package factorymethod;

interface Animal{
    enum Type{
        Rabbit, Tiger
    }
    void running();
    int getWeight();
}

class Rabbit implements Animal {
    private int weight;
    private String color;

    public Rabbit(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void running() {
        System.out.println("깡총 깡총 뛰기");
    }
}

class Tiger implements Animal {
    private int weight;
    private String color;

    public Tiger(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public void running() {
        System.out.println("성큼 성큼 뛰기");
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

class AnimalFactory {
    public Animal createAnimal(Animal.Type type) {
        switch (type) {
            case Rabbit:
                return new Rabbit(400,"WHITE");

            case Tiger:
                return new Tiger(1000,"BLACK");

            default:
                throw new IllegalArgumentException("유효한 타입이 아닙니다");
        }
    }
}
public class FactoryMethodMain {
    public static void main(String[] args) {
        // 만일 생성자 인터페이스가 변경될 경우 생성된 모든 객체들을 전부 바꿔줘야함
        Animal tiger1 = new Tiger(400,"WHITE");
        Animal tiger2 = new Tiger(400,"WHITE");
        Animal tiger3 = new Tiger(400,"WHITE");
        Animal tiger4 = new Tiger(400,"WHITE");

        Animal rabbit1 = new Rabbit(1000,"BLACK");
        Animal rabbit2 = new Rabbit(1000,"BLACK");
        Animal rabbit3 = new Rabbit(1000,"BLACK");
        Animal rabbit4 = new Rabbit(1000,"BLACK");
        //////////////////////////////////////////////////////////

        // AnimalFactory만 수정 해주면 됨
        AnimalFactory factory = new AnimalFactory();
        Animal newTiger1 = factory.createAnimal(Animal.Type.Tiger);
        Animal newTiger2 = factory.createAnimal(Animal.Type.Tiger);
        Animal newTiger3 = factory.createAnimal(Animal.Type.Tiger);
        Animal newTiger4 = factory.createAnimal(Animal.Type.Tiger);

        Animal newRabbit1 = factory.createAnimal(Animal.Type.Rabbit);
        Animal newRabbit2 = factory.createAnimal(Animal.Type.Rabbit);
        Animal newRabbit3 = factory.createAnimal(Animal.Type.Rabbit);
        Animal newRabbit4 = factory.createAnimal(Animal.Type.Rabbit);

    }

}
