package design_patterns.policy;

import design_patterns.point.PointData;

public abstract class Policy {
    abstract public PointData execute(int total, int point);
}
