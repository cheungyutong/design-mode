package factory.simplefactory.staticfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cheungyutong
 * @Date 2021/9/13 22:08
 * @Deprecation 反射实现, 规避if-else,但是高并发场景下不太好
 */
public class SimpleFactoryReflection {

    private static final Map<EnumProductType, Class> activityMap = new HashMap<>();

    public static void addProductKey(EnumProductType enumProduct, Class product) {
        activityMap.put(enumProduct, product);
    }

    public static ActivityOne product(EnumProductType type) throws InstantiationException, IllegalAccessException {
        Class prodcutClz = activityMap.get(type);
        return (ActivityOne) prodcutClz.newInstance();
    }

    public static class Product {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ActivityOne extends Product {
        private String stock;

        @Override
        public String toString() {
            return "ProductOne{" +
                    "stock='" + stock + '\'' +
                    '}';
        }
    }

    public static class ActivityTwo extends Product {
        private String stock;
    }

    public static void main(String[] args) {
        addProductKey(EnumProductType.activityOne, ActivityOne.class);
        try {
            ActivityOne product = product(EnumProductType.activityOne);
            System.out.println(product.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
