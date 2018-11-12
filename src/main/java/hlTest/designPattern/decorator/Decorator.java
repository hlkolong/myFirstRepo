package hlTest.designPattern.decorator;

/**
 * Created by zyf on 2017/3/30.
 * 装饰者模式中,所有装饰者的父类
 */
public abstract class Decorator extends Drinks{
    /***
     * 声明一个饮品引用,准备接受一个饮品对象<br/>
     */
    protected Drinks drinks;

    public Decorator(Drinks drinks) {
        this.drinks = drinks;
    }
}
