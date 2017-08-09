import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..
 */
public class code4_2 {
    public static void main(String[] args) {

        // int[]에서 ArrayList를 다루는 법으로 넘어가기.
        int[] array = {1,2,3,4,5,6,5,4,4,0,6,6,6};
        int majority = majority2(array);
        System.out.println(majority);
    }

    private static int majority2(int[] A) {
        int N = A.length;

        //각 원소가 0~100일 때의 count 로 빈도수를 체크한다
        int[] count = new int[101];
        Arrays.fill(count, 0);

        for (int i = 0; i < N ; ++i){
            count[A[i]]++;
        }
        //지금까지 확인한 숫자 중 빈도수가 제일 큰 것을 majority에 저장한다
        int majority = 0;
        for (int i = 1; i <= 100; ++i){
            if (count[i] > count[majority]){
                majority = i;
            }
        }

        return majority;
    }
}
