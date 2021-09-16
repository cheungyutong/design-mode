package builder.caseone;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:48
 * @Deprecation
 */
public class ClientBuilder {

    public static void main(String[] args) {
        //存放run顺序
        List<String> sequence = new ArrayList<>();
        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");
        //要用这个顺序造一辆车
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给奔驰组装者
        benzBuilder.setSequence(sequence);
        //奔驰组装者拿到顺序后就给生产一辆来
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

    }

}
