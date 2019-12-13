package cn.sumile.demo.dubbo.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath*:timer-spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

}