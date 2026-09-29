public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;

    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value = this.value + 1;

    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseby) {
        if (increaseby > 0) {
            this.value = this.value + increaseby;

        }

    }

    public void decrease(int decreaseby) {
        if (decreaseby > 0) {
            this.value = this.value - decreaseby;

        }
    }

    public String toString() {
        return "Value: " + this.value;
    }

}
