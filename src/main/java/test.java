import cn.jing.hello.web.po.RlUser;
import cn.jing.hello.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class test {
    @Autowired
    private UserService userService;

    @Test
    public void test1() throws Exception {
        RlUser byUserId = userService.getByUserId(1);
        System.out.println(byUserId);
    }


}
