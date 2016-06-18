package compBuilderA;

/**
 * Created by David on 22/05/16.
 */
public class Customer {

    private CompBuilder compBuilder;

    public void setCompBuilder(CompBuilder cb) {
        compBuilder = cb;
    }

    public Computer getComputer() {
        return compBuilder.getComputer();
    }

    public void constructComp() {
        compBuilder.createNewComp();
        compBuilder.buildMemory();
        compBuilder.buildCpu();
        compBuilder.buildDisplay();
        compBuilder.buildStorage();
    }

}
