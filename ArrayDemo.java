class ArrayDemo
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};      // 1

        int [] Brr = {10,20,30,40};     // 2
        
        int Crr[] = new int[4];         // 3

        Crr[0] = 10;
        Crr[0] = 20;
        Crr[0] = 30;
        Crr[0] = 40;

        System.out.println(Arr.length); //4
        System.out.println(Brr.length); //4
        System.out.println(Crr.length); //4

    }
}
