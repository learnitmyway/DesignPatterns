package compBuilderA;

/**
 * Created by David on 22/05/16.
 */
public abstract class CompBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComp() {
        computer = new Computer();
    }

    public abstract void buildMemory();
    public abstract void buildCpu();
    public abstract void buildDisplay();
    public abstract void buildStorage();
}
