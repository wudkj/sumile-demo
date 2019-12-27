package cn.sumile.demo.spi.impl;

import cn.sumile.demo.spi.SpiDemoService;

/**
 * @Description:
 * @Author: xiaokang.zhang
 * @Date: 2019/12/19 09:42
 */
public class SpiServiceSecond implements SpiDemoService {
    @Override
    public void showSpi() {
        System.out.println("SpiServiceSecond");
    }
}
