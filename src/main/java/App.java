import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2=
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());
        System.out.println(beanCat2.getMessage());

        System.out.println("HelloWorld beans: " + (bean == bean2) + "\n"
                + "Cat beans: " + (beanCat1 == beanCat2));
    }
}