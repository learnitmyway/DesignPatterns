package compBuilderA;

/**
 * Created by David on 22/05/16.
 */
public class LowEndCompBuilder extends CompBuilder {

    @Override
    public void buildMemory() {
        computer.setMemory(4);
    }

    @Override
    public void buildCpu() {
        computer.setCpu(1.6);

    }

    @Override
    public void buildDisplay() {
        computer.setDisplay(11);

    }

    @Override
    public void buildStorage() {
        computer.setStorage(128);
    }


}
