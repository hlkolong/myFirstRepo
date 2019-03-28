package hlTest.designPattern.strategy;

public class ConcreteStrategyA extends Strategy
{
    @Override
    public void algorithm() {
        System.out.println("使用策略A");
    }
}
