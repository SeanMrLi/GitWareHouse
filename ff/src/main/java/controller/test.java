package controller;

import com.google.common.base.Optional;

/**
 * Created by zhangruihaozhang on 17-7-14.
 */
public class test {
    public static void main(String[] args) {
        int i = 101;
        Optional<Integer> possible = Optional.of(i);
        System.out.println(possible.isPresent());
    }
}
