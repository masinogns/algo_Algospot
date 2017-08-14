/**
 * Created by masinogns on 2017. 8. 14..
 */
public class Canine extends Animal {

    @Override
    void makeNoise() {

    }

    @Override
    void roam() {

    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("개과 동물 Canine은 멍멍 먹습니다");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("개과 동물 Canine은 멍멍 잡니다");
    }
}
