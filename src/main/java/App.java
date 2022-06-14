import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        bean3.setName("Chernysh");
        System.out.println(bean3.getName());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        bean4.setName("Murzik");
        System.out.println(bean4.getName());

        System.out.println("HelloWorld: " + (bean==bean2));
        System.out.println("Catzzz: " + (bean3==bean4));

    }
}