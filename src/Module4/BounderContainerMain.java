package Module4;

public class BounderContainerMain {
    public static void main(String[] args) {
        BounderContainer<Integer> obj1 = new BounderContainer<>();
        obj1.setId(10);
        System.out.println("Integer: " + obj1.getId());

        BounderContainer<Double> obj2 = new BounderContainer<>();
        obj2.setId(10.5);
        System.out.println("Double: " + obj2.getId());
    }
}
