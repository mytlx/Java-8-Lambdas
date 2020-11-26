package com.mytlx.exercise.chapter8.strategy;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:36
 */
public class GzipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String data) {
        System.out.println("使用Gzip压缩方式进行压缩");
        System.out.println("data = " + data);
    }
}
