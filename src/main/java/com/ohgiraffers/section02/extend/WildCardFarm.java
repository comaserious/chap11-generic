package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /*필기. 매개변수로 받는 RabbitFarm을 구현할때, 어떤 토끼이던 상관이 없다\
    *  */
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }
    /*필기. 토끼농장은 bunny 이거나 bunny 후손만 가능*/
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    /*필기. 토끼농장의 토끼는 bunny 이거나 그 부모 타입으로 만들어진 토끼만 매개변수로 사용 가능*/
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }





}
