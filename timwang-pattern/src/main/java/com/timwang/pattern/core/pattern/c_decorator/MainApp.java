package com.timwang.pattern.core.pattern.c_decorator;

/**
 * @author wangjun
 * @date 2019/6/2
 */
public class MainApp {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.getDescription() + "总共花费" + cake.cost());

        FruitDecorator fruitDecorator = new FruitDecorator(cake);
        System.out.println(fruitDecorator.getDescription() + "总共花费" + fruitDecorator.cost());

        CandleDecorator candleDecorator = new CandleDecorator(fruitDecorator);
        System.out.println(candleDecorator.getDescription() + "总共花费" + candleDecorator.cost());
    }
}
