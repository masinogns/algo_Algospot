/**
 * Created by masinogns on 2017. 8. 14..
 */
abstract class Animal {
    String name;

    abstract void makeNoise();

    abstract void roam();

    public void eat(){
        System.out.println("먹이를 냠냠냠 동물이 먹습니다");
    }

    public void sleep(){
        System.out.println("동물이 쿨쿨쿨 잠을 잡니다");
    }
}
