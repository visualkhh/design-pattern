package design_patterns.point;

import design_patterns.policy.Policy;

public class PersonPoint extends Point {
    public PersonPoint(Policy policy) {
        super(policy);
    }
}
