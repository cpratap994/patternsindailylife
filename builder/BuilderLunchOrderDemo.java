package pattern.builder;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("wheat").condiments("onions").dressing("soy sauce");

        LunchOrder lunchOrder = builder.buid();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
