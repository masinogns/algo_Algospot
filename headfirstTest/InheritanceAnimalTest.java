import org.junit.Test;

/**
 * Created by masinogns on 2017. 8. 14..
 */
public class InheritanceAnimalTest {
    @Test
    public void test(){

        Animal canine = new Canine();
        Animal feline = new Feline();

        canine.name = "kaka";
        canine.eat();
        feline.eat();
    }

    @Test
    public void dogTest(){
        MyDogList dogList = new MyDogList();

        Dog d = new Dog();
        Cat c = new Cat();

        dogList.add(d);
//        dogList.add(c); It is impossible !!!
    }

    @Test
    public void animalTest(){
        MyAnimalList animalList = new MyAnimalList();

        Dog d = new Dog();
        Cat c = new Cat();

        animalList.add(d);
        animalList.add(c);
    }
}
