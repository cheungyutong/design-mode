package factory.simplefactory.flowengine.badcase;

/**
 * @Author cheungyutong
 * @Date 2021/9/14 21:41
 * @Deprecation 模拟电商复杂业务处理
 * 代码可读性不高
 * 代码拓展性不强
 * 耦合性太强,有些东西不好公用
 * 整体创建执行流程时间太长,串行调用下游服务
 */
public class ProductFlow {

    public boolean createItem() {
        //1.商品参数校验
        validateReq();
        //2.商品数据转换
        converDataForCreate();
        //3.商品基础校验
        validteItemBase();
        //4.校验店铺信息
        validateShpoInfo();
        //5.商品类目信息校验
        validateCategory();
        //6.商品校验信息的校验
        validateTradeInfo();
        //7.校验sku信息
        validateSku();
        //8.校验商品的业务拓展信息
        validateExtendInfo();
        //9.商品业务类型校验
        validateItemBiz();
        //10.商品风控
        validateItemRisk();
        //11.保存商品信息
        saveItem();
        //12.保存商品SKU信息
        saveItemSku();
        //13.保存商品SKU信息
        saveItemDetail();
        //14.保存商品发货区域
        saveAreaLimit();
        //15.保存商品邮费信息
        saveFreepost();
        return true;
    }

    //1.商品参数校验
    private void validateReq() {
    }

    //2.商品数据转换
    private void converDataForCreate() {
    }

    //3.商品基础校验
    private void validteItemBase() {
    }

    //4.校验店铺信息
    private void validateShpoInfo() {
    }

    //5.商品类目信息校验
    private void validateCategory() {
    }

    //6.商品校验信息的校验
    private void validateTradeInfo() {
    }

    //7.校验sku信息
    private void validateSku() {
    }

    //8.校验商品的业务拓展信息
    private void validateExtendInfo() {
    }

    //9.商品业务类型校验
    private void validateItemBiz() {
    }

    //10.商品风控
    private void validateItemRisk() {
    }

    //11.保存商品信息
    private void saveItem() {
    }

    //12.保存商品SKU信息
    private void saveItemSku() {
    }

    //13.保存商品SKU信息
    private void saveItemDetail() {
    }

    //14.保存商品发货区域
    private void saveAreaLimit() {
    }

    //15.保存商品邮费信息
    private void saveFreepost() {
    }
}

