package Point1;

public class Point1 {

    private int x;
    private int y;

    public Point1() {
    }

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return (Math.sqrt((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y)));
    }

    public double distance(int x, int y) {
        return (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)));
    }

    public double distance(Point1 another) {
        int x = another.getX();
        int y = another.getY();

        return (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)));
    }
}
