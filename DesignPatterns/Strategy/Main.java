/**
 * Created by masinogns on 2017. 8. 19..
 */
public class Main {
    public static void main(String[] args) {

        GameCharater gameCharater = new GameCharater();

        gameCharater.setWeapon(new Knife());
        gameCharater.attack();
    }
}
