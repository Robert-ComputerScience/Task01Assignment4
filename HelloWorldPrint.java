public class HelloWorldPrint {


    // Count down minuses the even numbers until it reaches 0.
    public static void countDown(int num) {

        if (num == 0) { // test

            System.out.println("Blastoff!");

        } else
        {
            if(num % 2 == 0) {

                System.out.println(num);
            }
            countDown(num - 1); // recursive call

        }


    }

    public static void main(String[] args)
    {

        countDown(6);
    }
}

//  Time complexity
// O(n)
// num % 2 == 0  |
//           6              |
//           4              |
//           2              |
//      BlastOff        |



