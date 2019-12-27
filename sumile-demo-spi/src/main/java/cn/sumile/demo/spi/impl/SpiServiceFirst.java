package cn.sumile.demo.spi.impl;

import cn.sumile.demo.spi.SpiDemoService;

/**
 * @Description:
 * @Author: xiaokang.zhang
 * @Date: 2019/12/19 09:39
 */
public class SpiServiceFirst implements SpiDemoService {
    @Override
    public void showSpi() {
        System.out.println("SpiServiceFirst");
    }
}
