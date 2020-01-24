public class probOne
{
    //------------------------------------------------------------------------------------------------------------------
    // declare array of length 200 which stores ints. make indexes 0-30 values 1, 2, 3, 4, etc.
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        int[] intArray = new int[200];
        for (int i = 0; i <= 30; i++) {
            intArray[i] = i+1;
            System.out.println("Value: " + intArray[i] + "\tIndex: " + i);
        }
    }
}