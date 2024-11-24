package design_patterns;


import design_patterns.point.PersonPoint;
import design_patterns.point.Point;
import design_patterns.point.PointExecutor;
import design_patterns.policy.FixedPolicy;
import design_patterns.policy.PercentPolicy;
import design_patterns.policy.Policy;

/*
포인트
- 기업
- 개인
- 마켓팅

정책
- 1회에 한번에 쓸수있는 양이 정해져있음
- 통합 결제 금액의 몇%
- 고정포인트

 */
public class Main {
    private final PointExecutor executor;

    public Main(PointExecutor executor) {
        this.executor = executor;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Main main = new Main(new PointExecutor(new PersonPoint(null)));
        var executor = main.createExecutor();
        executor.execute();
    }


    public PointExecutor createExecutor() {
        return this.executor;
    }


    public Point getPoint(){
        return new PersonPoint(getPolicy());
    }

    public Policy getPolicy(){
        long s = System.currentTimeMillis();
        if(s%2==0){
            return new FixedPolicy();
        }else{
            return new PercentPolicy();
        }
    }

}