public class probThree
{
    //------------------------------------------------------------------------------------------------------------------
    // declare an array of String type named towns and assign three values "Boston", "Paris", "London". Array town has
    // capacity 100. Print the array
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String[] towns = new String[100];
        for (int i = 0; i <= 2; i++)
        {
            switch (i)
            {
                case 0:
                    towns[i] = "Boston";
                    break;
                case 1:
                    towns[i] = "Paris";
                    break;
                case 2:
                    towns[i] = "London";
                    break;
                default:
                    towns[i] = "";
                    break;
            }
            System.out.println("Value: " + towns[i] + "\tIndex: " + i);
        }
    }
}
