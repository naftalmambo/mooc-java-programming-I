
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter migos = new Counter(9);
        System.out.println(migos);

        migos.increase();
        migos.increase();
        System.out.println(migos);
        migos.increase();
        migos.decrease();
        migos.increase(10);
        migos.decrease(3);
        System.out.println(migos);

    }
}
