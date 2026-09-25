import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        // Pseudocode for Task #2
        // class BirthMonth
        //    main()
        //        declare variables
        //        num birthMonth = 0;
        //        output "Enter your birth month in number: "
        //        input birthMonth
        //        Process
        //        if birthMonth >= 1 and birthMonth <= 12 then
        //            OUTPUT "Your birth month is: " + birthMonth
        //        else
        //            OUTPUT "You entered an incorrect month value: " + birthMonth
        //        end if
        //    return
        // endClass

        // Java Code for Task #2
        {
            Scanner in = new Scanner(System.in);
            int birthMonth = 0;
            String trash = "";

            System.out.print("Enter your birth month in number: ");
            if (in.hasNextInt()) {
                birthMonth = in.nextInt();
                in.nextLine(); // Clear the buffer
            } else {
                trash = in.nextLine(); // Clear the buffer
                System.out.println("You entered an incorrect month value: " + trash);
                System.exit(0);
            }
            // Process
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is:  " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value:  " + birthMonth);
        }
        }

    }
}
