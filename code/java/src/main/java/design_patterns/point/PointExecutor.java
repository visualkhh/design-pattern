package design_patterns.point;

public class PointExecutor {
    Point point;
    int total = 1000;
    public PointExecutor(Point point) {
        this.point = point;
    }

    public void changePoint(Point point) {
        this.point = point;
    }

    public void execute() {
        System.out.println("PointExecutor.execute");
    }
}
