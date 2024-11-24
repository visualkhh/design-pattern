package design_patterns.point;

import design_patterns.policy.Policy;

public abstract class Point {
    Policy policy;
    int value = 0;
    public Point(Policy policy) {
        this.policy = policy;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public PointData execute(int total) {
        var data = this.policy.execute(total, this.value);
        this.setValue(data.point());
        return data;
    }

}
