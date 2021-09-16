package builder.caseone;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cheungyutong
 * @Date 2021/9/15 21:14
 * @Deprecation 抽象类,汽车模板
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();//维护一个ArrayList保存执行命令关键字

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {//根据ArrayList中保存的顺序执行相应的动作
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start"))
                this.start();//启动汽车
            else if (actionName.equalsIgnoreCase("stop"))
                this.stop();//停止汽车
            else if (actionName.equalsIgnoreCase("alarm"))
                this.alarm();//汽车鸣笛
            else if (actionName.equalsIgnoreCase("engineBoom"))
                this.engineBoom();//汽车轰鸣
        }
    }

    final public void setSequence(List<String> sequence) {//获得执行顺序的命令,即一个ArrayList
        this.sequence = sequence;
    }

}
