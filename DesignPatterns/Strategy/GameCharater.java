/**
 * Created by masinogns on 2017. 8. 19..
 */
public class GameCharater {
    // 추상적인 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        if (weapon == null){
            System.out.println("맨손 공격");
        }else {
            // 델리게이트 !! GameCharater 객체의 attack이라는 소스는 Weapon이라는 객체에서 기능을 호출해서 구현한다
            weapon.attack();
        }
    }
}
