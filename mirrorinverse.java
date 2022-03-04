public class mirrorinverse
{
    public static void main(String args[])
    {
        int count=0;
        int arr[]={3,4,5,0,1,2};
        for(int i=0;i<arr.length;i++)
        {
            if (arr[arr[i]]==i)
            {
                count++;
            }
        }
        if (count!=0)
    {
        System.out.println("The given array is mirror inverse");
    }
         else
        {
            System.out.println("The given array is not mirror inverse");
        
        }
    }
}

