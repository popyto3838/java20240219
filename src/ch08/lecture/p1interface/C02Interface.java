package ch08.lecture.p1interface;

public class C02Interface {
    C02Cat cat = new C02Cat();
    C02Tiger tiger = new C02Tiger();
    C02GoldFish goldFish = new C02GoldFish();

    C02Animal animal;


}

interface C02Pet {

}

interface C02Aquatic {

}

class C02Animal {
}

class C02Cat extends C02Animal implements C02Pet {
}

class C02GoldFish extends C02Animal implements C02Pet, C02Aquatic {
}

class C02Tiger extends C02Animal {
}

