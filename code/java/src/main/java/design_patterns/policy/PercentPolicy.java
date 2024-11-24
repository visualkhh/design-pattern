package design_patterns.policy;

import design_patterns.point.PointData;

public class PercentPolicy extends Policy {
    public PercentPolicy() {
    }

    @Override
    public PointData execute(int total, int point) {
        var a = Math.min((total / 10), point);
        if (a < 0 ){
            throw new IllegalArgumentException("point must be positive");
        }
        return new PointData(a, point - 6);
    }
}
