/**
 * Created by masinogns on 2017. 8. 14..
 */
public class Feline extends Animal {
    @Override
    void makeNoise() {
        System.out.println("고양이과 동물은 야옹야옹 웁니다");
    }

    @Override
    void roam() {

    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("고양이과 동물은 야옹야옹 먹습니다");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
