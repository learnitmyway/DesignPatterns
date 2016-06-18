package compBuilderA;

/**
 * Created by David on 22/05/16.
 */
public class Computer {

    private int memory;
    private double cpu;
    private double display;
    private int storage;

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return ("\nMemory: " + memory + "GB" +
                "\nCpu: " + cpu + "GHz" +
                "\nDisplay: " + display + "\"" +
                "\nStorage: " + storage + "GB");
    }
}
