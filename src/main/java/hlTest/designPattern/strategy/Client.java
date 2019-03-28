package hlTest.designPattern.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.algorithm();
    }
}
