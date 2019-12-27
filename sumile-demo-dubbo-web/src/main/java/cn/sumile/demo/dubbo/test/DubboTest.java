import cn.sumile.timer.facade.facade.TestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xiaokang.zhang
 * @Date: 2019/12/13 15:35
 */
@Component
public class DubboTest {
    @Autowired
    TestFacade testFacade;

    public void testTest() {
        String result = testFacade.test();
        System.out.println(result);
    }

}
