package orgg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.userDao.say();
    }
}
