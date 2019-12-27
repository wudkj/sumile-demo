package cn.sumile.demo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description:
 * @Author: xiaokang.zhang
 * @Date: 2019/12/19 09:43
 */
public class MainClass {
    public static void main(String[] args) {
        ServiceLoader<SpiDemoService> spiDemoService = ServiceLoader.load(SpiDemoService.class);
        Iterator<SpiDemoService> iterator = spiDemoService.iterator();
        while (iterator.hasNext()){
            SpiDemoService service = iterator.next();
            service.showSpi();
        }
    }
}
