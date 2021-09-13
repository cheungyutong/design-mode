package factory.simplefactory.staticfactory;

/**
 * @Author cheungyutong
 * @Date 2021/9/13 21:33
 * @Deprecation 简单工厂之静态工厂
 * 违反开闭原则:每增加一种type,需要维护createProduct方法if-else
 */
public class SimpleFactory {

    public static Share createProduct(EnumProductType type) {
        if (EnumProductType.activityOne.equals(type)) {
            return new ProductOne();
        } else if (EnumProductType.activityTwo.equals(type)) {
            return new ProductTwo();
        }
        return null;
    }

    public enum EnumProductType {
        activityOne, activityTwo;
    }

}
