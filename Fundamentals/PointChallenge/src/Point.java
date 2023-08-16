public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = getX();
        this.y = getY();
    }

    public Point(int x, int y) {
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
        int xAns = (0 - getX())*(0 - getX());
        int yAns = (0 - getY())*(0 - getY());
        return Math.sqrt(xAns + yAns);
    }

    public double distance(int x, int y) {
        int xAns = (this.x - x)*(this.x - x);
        int yAns = (this.y - y)*(this.y - y);
        return Math.sqrt(xAns + yAns);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}