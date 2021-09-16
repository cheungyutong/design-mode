package flowengine;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cheungyutong
 * @Date 2021/9/14 21:58
 * @Deprecation 创建Context上下文, 作为我们调用上下游服务的返回结果
 */
public class Context {

    //结果缓存
    private Map<String, Object> resultMap = new HashMap<>();

    public Map<String, Object> getAdaptorMap() {
        return resultMap;
    }

    public void setAdaptorMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

}
