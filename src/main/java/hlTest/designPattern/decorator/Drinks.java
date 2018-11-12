package hlTest.designPattern.decorator;

/**
 * auth：hl
 * 参考博客：https://blog.csdn.net/android_zyf/article/details/68343953
 *
 * 上述的例子中,可以以饮品为主体,用不用的各种需求来装饰它,比如有一个可乐对象,那我用一个加冰对象装饰一下,
 * 再用加糖对象装饰一下,最后能得到一个加冰加糖可乐,这时候就将原可乐对象扩展,得到了加冰和加糖两种装饰.
 * 装饰者模式: 动态地将责任附加到对象上,对扩展功能来说,装饰者比继承更有弹性更灵活
 * (因为子类继承父类扩展功能的前提,是已知要扩展的功能是什么样的,而这是在编译时就要确定的,
 * 但是装饰者模式可以实现动态(在运行时)去扩展功能).
 * ---------------------
 * 作者：george_zyf
 * 来源：CSDN
 * 原文：https://blog.csdn.net/android_zyf/article/details/68343953
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public abstract class Drinks {
    String name;
    /**
     * 每个饮品的价格不同,所以讲price方法抽象化<br/>
     * 让每个实现"饮品"类的子类自己决定是多少钱
     * */
    public abstract int price();

    public String getName(){
        return this.name;
    }

}
