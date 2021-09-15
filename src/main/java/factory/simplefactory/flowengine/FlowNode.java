package factory.simplefactory.flowengine;

import org.apache.commons.lang.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author cheungyutong
 * @Date 2021/9/14 22:05
 * @Deprecation 创建流程节点,这相当于就是保存我们整个流程中需要执行下游服务的结点,以Map作为保存数据,NodeConf节点设置参数
 */
public class FlowNode {

    private Map<String, NodeConf> nodeMap = new LinkedHashMap<>();

    private void add(String groupName, Class node, NodeConf nodeConf) {
        String key = null;
        if (StringUtils.isNotBlank(groupName))
            key = groupName + "_" + node.getName();
        else
            key = node.getName();
        if (nodeMap.containsKey(key))
            return;
        nodeMap.put(key, nodeConf);
    }

    private void add(Class node, NodeConf nodeConf) {
        add(node.getName(), node, nodeConf);
    }

    private void replace(String groupName, Class node, NodeConf nodeConf) {
        String key = null;
        if (StringUtils.isNotBlank(groupName))
            key = groupName + "_" + node.getName();
        else
            key = node.getName();
        nodeMap.put(key, nodeConf);
    }

    public void replace(Class node, NodeConf nodeConf) {
        replace(node.getName(), node, nodeConf);
    }

    private void remove(String groupName, Class node) {
        String key = null;
        if (StringUtils.isNotBlank(groupName))
            key = groupName + "_" + node.getName();
        else
            key = node.getName();
        nodeMap.remove(key);
    }

    public void remove(Class node) {
        remove(node.getName(), node);
    }

    public Set<String> getNodeList() {
        return nodeMap.keySet();
    }

    public Map<String, NodeConf> getNodeMap() {
        return nodeMap;
    }

    public void setMap(LinkedHashMap<String, NodeConf> map) {
        this.nodeMap = map;
    }

    public static class NodeConf {
        private int timeout = 100;

        public NodeConf() {
        }

        public NodeConf(int timeout) {
            this.timeout = timeout;
        }

        public int getTimeout() {
            return timeout;
        }

        public void setTimeout(int timeout) {
            this.timeout = timeout;
        }
    }
}
