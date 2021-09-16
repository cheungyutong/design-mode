package factory.simplefactory.builder;

import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:46
 * @Deprecation 建造者
 */
public class BmwBuilder extends CarBuilder {

    private final static String FLAG = "TEST BUILDER";

    private BmwModel bmw = new BmwModel();//宝马车实例

    @Override
    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);//设置宝马的运行顺序
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;//将宝马实例返回
    }
}
