import java.util.Date;

/**
 * Created by masinogns on 2017. 8. 21..
 */
public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스에서 마력 회복 물약의 정보를 가져옵니다");
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성했습니다"+new Date());
    }
}
