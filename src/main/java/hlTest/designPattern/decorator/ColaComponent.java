package hlTest.designPattern.decorator;

public class ColaComponent extends Drinks {

    public ColaComponent(){
        //设置name为可乐
        //这个name属性是从饮品类中继承来的
        name = "可乐";
    }

    @Override
    public int price() {
        //可乐30块一瓶~
        return 30;
    }
}
