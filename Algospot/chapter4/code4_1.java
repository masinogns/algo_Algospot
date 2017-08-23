/**
 * Created by masinogns on 2017. 8. 9..
 */
public class code4_1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,5,4,4,0};

        int majority = majority1(array);
        System.out.println(majority);
    }

    /**
     * 주어진 배열 array에서 가장 많이 등장하는 숫자를 반환한다
     * 만약 두 가지 이상 있을 경우 아무것이나 반환한다
     * @param array
     */
    private static int majority1(int[] array) {
        int N = array.length;
        int majority = -1, majorityCount = 0;

        for (int i = 0; i < N; i++){
            //A에 등장하는 A[i]의 수를 센다
            int V = array[i], count = 0;
            for (int j = 0; j < N; j++){
                if (array[j] == V){
                    ++count;
                }
            }

            // 지금까지 본 최대 빈도보다 많이 출현했다면 답을 갱신하다
            if (count > majorityCount){
                majorityCount = count;
                majority = V;
            }
        }
        return majority;
    }
}
