package builder.caseone;

import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:39
 * @Deprecation
 */
public abstract class CarBuilder {

    //建造一个模型,给一个顺序要求
    public abstract void setSequence(List<String> sequence);

    //设置完毕顺序后,就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();

}
