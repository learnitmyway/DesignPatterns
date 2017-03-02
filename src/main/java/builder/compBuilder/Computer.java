package builder.compBuilder;

/**
 * Created by David on 22/05/16.
 */
public class Computer {

    private int memory;
    private double cpu;
    private double display;
    private int storage;

    private boolean leatherCase;

    @Override
    public String toString() {
        return ("\nMemory: " + memory + "GB" +
                "\nCpu: " + cpu + "GHz" +
                "\nDisplay: " + display + "\"" +
                "\nStorage: " + storage + "GB" +
                "\nLeather Case: " + leatherCase);
    }

    public static class Builder {

        // required
        private int memory;
        private double cpu;
        private double display;
        private int storage;

        // optional
        private boolean leatherCase;

        public Builder(int memory, double cpu, double display, int storage) {
            this.memory = memory;
            this.cpu = cpu;
            this.display = display;
            this.storage = storage;
        }

        public Builder leatherCase(boolean isLeatherCase) {
            leatherCase = isLeatherCase;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    private Computer(Builder builder) {

        // required
        memory = builder.memory;
        cpu = builder.cpu;
        display = builder.display;
        storage = builder.storage;

        // optional
        leatherCase = builder.leatherCase;
    }

    public static void main(String[] args) {
        Computer computer = new Computer.Builder(4, 1.6, 11.0, 128).leatherCase(true).build();
        System.out.println(computer);
    }
}
