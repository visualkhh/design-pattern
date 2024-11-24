package design_patterns.policy;

import design_patterns.point.PointData;

public class OnePolicy extends Policy {
    public OnePolicy() {
    }

    @Override
    public PointData execute(int total, int point) {
        var t = total - point;
        return new PointData(t, point  -5);
    }
}
