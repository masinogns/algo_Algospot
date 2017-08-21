/**
 * Created by masinogns on 2017. 8. 21..
 */
public class DefaultGameConnection extends AbstGameConnectionHelper {
    @Override
    protected String doSecurity(String string) {
//        System.out.println("디코드");
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // 서버에서 유저 이름 유저의 나이를 알 수 있다
        // 그래서 나이를 확인하고 시간을 확인한다
        // 성인이 아니고 10시가 지났다면
        // 권한이 없는 것으로 한다
        return 0;// 게임 매니저임을 리턴!
    }

    @Override
    protected String connection(String info) {
        //확인이 끝냈으니까 접속할 수 있는 주소를 넘겨주던지 한다
        System.out.println("마지막 접속 단ㄱㅖ");
        return null;
    }
}
