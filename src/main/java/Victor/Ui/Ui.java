package victor.ui;

import java.util.Scanner;

/**
 * The Ui class is the portion of the code that handles the User interface
 * portion of the code. It's methods include displaying the intro and
 * ending greetings, displaying a barrier to separate certain sections and
 * also take in and read the user command.
 *
 * @author Dominic Fu Ming Jun
 */
public class Ui {

    /** The intro variable is used to hold the greeting this program says when it starts running. */
    protected String intro;
    /** The ending variable is used to hold the ending String this program says when the user inputs "bye". */
    protected String ending;
    /** The barrier variable is used to hold the String that acts as a barrier to better separate the output. */
    protected String barrier = "____________________________________________________________";

    /**
     * The Ui constructor takes in no parameters, but it does
     * assign the predetermined Strings for the intro greeting and
     * the ending greeting.
     *
     */
    public Ui() {
        this.intro = "____________________________________________________________\n"
                + " Hello! I'm VICTOR\n"
                + " What can I do for you?\n"
                + "____________________________________________________________\n";
        this.ending = "____________________________________________________________\n"
                + " Bye. Hope to see you again soon!\n"
                + "____________________________________________________________";
    }

    /**
     * The showIntro method is used to print out the intro greeting when called.
     * It doesn't take in any inputs nor does it return anything.
     *
     */
    public void showIntro() {
        System.out.println(this.intro);
    }

    /**
     * The showEnding method is used to print out the ending String when called.
     * It doesn't take in any inputs nor does it return anything.
     *
     */
    public void showEnding() {
        System.out.println(this.ending);
    }

    /**
     * The readCommand method is used to scan the user input and return it
     * to the Parser class, so it can decode the command.
     *
     * @return A string which is the user command
     *
     */
    public String readCommand() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * The displayBarrier method is used to print out the
     * barrier variable, and is normally used to separate the outputs for each
     * user command to improve ease of readability.
     *
     */
    public void displayBarrier() {
        System.out.println(this.barrier);
    }

}
