package design_patterns.policy;

public class FixedPolicy extends Policy {
    public FixedPolicy() {
    }

    @Override
    public int execute(int total, int point) {
        return 0;
    }
}
