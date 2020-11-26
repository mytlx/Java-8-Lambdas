package com.mytlx.exercise.chapter8.strategy;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:40
 */
public class Compressor {

    private final CompressionStrategy strategy;

    public Compressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(String data) {
        System.out.println("调用compress方法");
        strategy.compress(data);
    }


}
