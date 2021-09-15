package factory.simplefactory.flowengine;

/**
 * @Author cheungyutong
 * @Date 2021/9/14 23:19
 * @Deprecation 节点接口
 */
public interface IFlowNode<T> {

    //node执行方法
    T invokeNode(FlowEngine.RunData nodeData, Context context);

    //node执行完后执行的方法
    void afterInvoke(FlowEngine.RunData nodeData, Context context);

    //从context中获取此node的结果key
    String resultKey();

}

