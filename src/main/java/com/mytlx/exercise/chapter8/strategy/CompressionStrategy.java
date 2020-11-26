package com.mytlx.exercise.chapter8.strategy;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:35
 */
@FunctionalInterface
public interface CompressionStrategy {

    void compress(String data);

}
