package design_patterns.point;

import design_patterns.policy.Policy;

public class CompanyPoint  extends Point {
    public CompanyPoint(Policy policy) {
        super(policy);
    }
}
