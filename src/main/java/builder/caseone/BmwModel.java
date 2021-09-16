package builder.caseone;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:31
 * @Deprecation 宝马实现类
 */
public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马轰鸣...");
    }
}
