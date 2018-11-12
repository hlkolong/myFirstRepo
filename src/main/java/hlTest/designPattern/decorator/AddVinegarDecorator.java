package hlTest.designPattern.decorator;

public class AddVinegarDecorator extends Decorator{

    public AddVinegarDecorator(Drinks drinks) {
        super(drinks);
    }

    public void addVinegar(){
        System.out.println("需要加醋，加完了。");
    }


    /***
     * 那么加醋后的价格应该是多少呢?<br/>
     * 应该是加粗的价格加饮品的价格
     * @return 加醋五块
     */
    @Override
    public int price() {
        return 5 + drinks.price();
    }

    /***
     * 再复写一个名字的方法<br/>
     * 现在已经不是单纯的饮品了
     * @return
     */
    @Override
    public String getName(){
//        在这里加醋
        addVinegar();
        return "加了醋的" + drinks.getName();
    }
}
