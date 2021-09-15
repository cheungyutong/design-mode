package factory.simplefactory.flowengine;

import cn.hutool.core.collection.CollectionUtil;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author cheungyutong
 * @Date 2021/9/14 22:31
 * @Deprecation
 */
public class FlowEngine {

    //执行引擎入口
    public void execute(FlowNode flowNode, Context context) {
        Map<String, List<String>> nodeGroup = groupByGroupName(flowNode);
        Map<String, FlowNode.NodeConf> nodeMap = flowNode.getNodeMap();
        for (String groupName : nodeGroup.keySet()) {
            boolean needThrowExp = false;
            List<String> nodeNameList = nodeGroup.get(groupName);
            //只有一个节点,串行
            if (nodeNameList.size() == 1) {
                String nodeName = nodeNameList.get(0);
            } else {

            }
        }
    }

    //流程中的参数
    public static class RunData {
        private String paramOne;
        private String paramTwo;

        public String getParamOne() {
            return paramOne;
        }

        public void setParamOne(String paramOne) {
            this.paramOne = paramOne;
        }

        public String getParamTwo() {
            return paramTwo;
        }

        public void setParamTwo(String paramTwo) {
            this.paramTwo = paramTwo;
        }
    }

    private Map<String, List<String>> groupByGroupName(FlowNode flowNode) {
        Map<String, List<String>> nodeGroup = new LinkedHashMap<>();
        for (String nodeKey : flowNode.getNodeList()) {
            String groupName = getGroupName(nodeKey);
            String nodeName = getNodeName(nodeKey);
            if (StringUtils.isNotBlank(groupName)) {
                List<String> nodeNameList = new ArrayList<>();
                nodeNameList.add(nodeName);
                nodeGroup.put(nodeName, nodeNameList);
            } else {
                List<String> nodeNameList = nodeGroup.get(groupName);
                if (CollectionUtil.isEmpty(nodeNameList)) {
                    nodeNameList = new ArrayList<>();
                }
                nodeNameList.add(nodeName);
                nodeGroup.put(groupName, nodeNameList);
            }
        }
        return nodeGroup;
    }

    private String getGroupName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[1] : null;
    }

    private String getNodeName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[1] : arr[0];
    }

    public static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10,
            60L, TimeUnit.MINUTES, new LinkedBlockingDeque<Runnable>(500),
            new ThreadPoolExecutor.AbortPolicy() {
                @Override
                public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                    throw new RejectedExecutionException("Task" + r.toString() + "rejected from" + executor.toString());
                }
            });
}
