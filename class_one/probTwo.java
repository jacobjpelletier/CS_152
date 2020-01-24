public class probTwo
{
    //------------------------------------------------------------------------------------------------------------------
    // declare an array boolValues of boolean type elements with capacity 100 and assign first 50 alternating values
    // true, false, true, false, etc.
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        boolean[] boolValues = new boolean[100];
        for (int i = 0; i <= 50; i++)
        {
            if (i % 2 == 0)
                boolValues[i] = true;
            else
                boolValues[i] = false;
            System.out.println("Value: " + boolValues[i] + "\tIndex: " + i);
        }
    }
}
