package com.ohgiraffers.section02.extend;

public class RabbitFarm<T extends Rabbit> {

    /*필기. 타입변수는 아직 어떤 토끼가 들어올지 모른다
    *      다만 토끼 이거나 토끼의 후손만 가능하도록 제한한 것이다*/

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal){
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }


}
