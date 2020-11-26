package com.mytlx.exercise.chapter8.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:42
 */
public class Main {

    /**
     * 策略模式：传统方式
     */
    @Test
    public void test01() {
        Compressor gzipCompressor = new Compressor(new GzipCompressionStrategy());
        Compressor zipCompressor = new Compressor(new ZipCompressionStrategy());

        gzipCompressor.compress("data");
        zipCompressor.compress("data");
    }

    /**
     * 策略模式：函数引用
     */
    @Test
    public void test02() {
        // 直接省略两个类
        Compressor gzipCompressor = new Compressor(System.out::println);
        Compressor zipCompressor = new Compressor(System.out::println);

        gzipCompressor.compress("gzip data");
        zipCompressor.compress("zip data");
    }
}
