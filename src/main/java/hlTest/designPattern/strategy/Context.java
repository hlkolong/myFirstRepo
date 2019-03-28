package hlTest.designPattern.strategy;

//import org.codehaus.plexus.classworlds.strategy.Strategy;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void algorithm(){
        this.strategy.algorithm();
    }

}
