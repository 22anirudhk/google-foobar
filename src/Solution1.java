
public class Solution1 {
    public static int solution(int[] x, int[] y) {

        if(x.length > y.length)
        {
            for(int i = 0; i < y.length; i++)
            {
                if(!contains(y, x[i]))
                {
                    return x[i];
                }
            }
            return x[x.length-1];
        }
        else
        {
            for(int i = 0; i < x.length; i++)
            {
                if(!contains(x, y[i]))
                {
                    return y[i];
                }
            }
            return y[y.length-1];
        }

    }

    //Inefficient
    private static boolean contains(int[] arr, int num)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
                return true;
        }
        return false;
    }

    //Short test
    public static void main(String[] args)
    {
        int[] x = {13, 5, 6, 2, 5};
        int[] y = {5, 2, 5, 13};
        System.out.println(solution(x,y));
    }
}
