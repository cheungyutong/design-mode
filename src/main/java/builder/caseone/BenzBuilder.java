package builder.caseone;

import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:44
 * @Deprecation
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();//奔驰车实例

    @Override
    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);//设置奔驰的运行顺序
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;//将这个模型返回
    }

}
