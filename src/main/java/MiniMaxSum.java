import java.util.Arrays;
import java.util.stream.Collectors;

public class MiniMaxSum {
    public void miniMaxSum(int arr[]){
        Arrays.sort(arr);
        long maxSum = 0, minSum = 0;
//        for ( int i = 0; i< arr.length; i++ ){
//            if ( i > 0)
//                maxSum = maxSum + arr[i];
//            if ( i < 4 )
//                minSum = minSum + arr[i];
//        }
//
//        System.out.println(minSum + " " +  maxSum);
        for (int i=1; i< arr.length; i++ ){
            maxSum = maxSum + arr[i];
        }

        System.out.println(maxSum);
        //overflow integer
    }
}