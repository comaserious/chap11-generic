package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;


public class Application01 {

    public static void main(String[] args) {

        /*수업목표. extends 키워드를 이용하여 특정 타입만 사용하도록 범위 제한*/

        /*필기.
        *  제네릭 클래스 작성시 extends 키워드를 사용하면
        *  특정 타입만 사용하도록 제한을 걸 수 있다
        *  예제로 구술 하자면 Rabbit의 후손 또는 Rabbit 타입만 사용이 가능하다*/

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//         RabbitFarm<Mammal>  farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        /*필기. Rabbit 타입이거나 Rabbit 후손타입이면 가능하다*/

        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setAnimal(new Rabbit());
        farm1.getAnimal().cry();

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();





    }
}
