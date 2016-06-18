package compBuilderA;

/**
 * Created by David on 22/05/16.
 */
public class HighEndCompBuilder extends CompBuilder {

    @Override
    public void buildMemory() {
        computer.setMemory(16);
    }

    @Override
    public void buildCpu() {
        computer.setCpu(3.1);

    }

    @Override
    public void buildDisplay() {
        computer.setDisplay(13.3);

    }

    @Override
    public void buildStorage() {
        computer.setStorage(1000);
    }

}
