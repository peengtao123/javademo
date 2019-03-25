package orgg;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("userDao")
public class UserDao {
    public void say(){
        System.out.println("hello li");
    }
}
