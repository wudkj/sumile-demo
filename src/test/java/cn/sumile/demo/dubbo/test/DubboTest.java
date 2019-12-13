package cn.sumile.demo.dubbo.test;

import cn.sumile.timer.facade.facade.TestFacade;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author: xiaokang.zhang
 * @Date: 2019/12/13 15:35
 */

public class DubboTest extends BaseTest {
    @Autowired
    TestFacade testFacade;

    @Test
    public void testTest() {
        String result = testFacade.test();
        System.out.println(result);
    }

}
