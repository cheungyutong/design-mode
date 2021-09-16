package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:36
 * @Deprecation 测试类
 * 问题就是不断的随着车的增加而新增
 */
public class Client {

    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        //存放run顺序
        List<String> sequence = new ArrayList<>();
        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");
        //顺序赋予
        benz.setSequence(sequence);
        benz.run();
    }

}
