public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;

    }

    public int volume() {
        int volume = edgeLength * edgeLength * edgeLength;
        return volume;
    }

    public String toString() {
        int l = this.edgeLength;
        int v = this.volume();
        return "The length of the edge is " + l + " and the volume " + v;

    }

}
