package DebuggingExercises;

/**
 * Created by jc319816 on 4/09/16.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {5, 75, 34, 23, 4, 32, 1, 6, 45, 21, 15, 12, 9, 19, 87};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}
