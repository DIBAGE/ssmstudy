import com.linchao.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
public class Main {

    private UserServiceImp userServiceImp;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Main m = new Main();
        m.userServiceImp = (UserServiceImp) context.getBean("userServiceImp");
        System.out.println(m.userServiceImp);
    }
}
