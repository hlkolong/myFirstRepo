package hlTest.designPattern.decorator;

public class BeerComponent extends Drinks{
    public BeerComponent() {
        name = "啤酒";
    }

    @Override
    public int price() {
        return 5;
    }
}
