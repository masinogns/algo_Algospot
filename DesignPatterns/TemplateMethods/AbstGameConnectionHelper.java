package TemplateMethods;

/**
 * Created by masinogns on 2017. 8. 21..
 */
public abstract class AbstGameConnectionHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodedInfo){
        //보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        //반환된 것을 가지고 아이디 암호를 할당한다
        String id = "aaa";
        String password = "bbb";

        if(!authentication(id, password)){
            throw new Error("아이디 암호 불일치");
        }

        String userName = "";
        int i = authorization(userName);

        switch (i){
            // 셧다운제
            case -1:
                break;
            case 0:// 게임 매니저
                System.out.println("게임 매니저");
                break;
            case 1:// 유료회원
                System.out.println("유료 회원");
                break;
            case 2:// 무료회원
                break;
            case 3:// 권한 없읍
                break;

            default:// 기타 상황
                break;
        }

        return connection(decodedInfo);
    }
}
