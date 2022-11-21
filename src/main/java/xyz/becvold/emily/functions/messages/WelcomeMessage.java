package xyz.becvold.emily.functions.messages;

import xyz.becvold.emily.utils.ConsoleUtils;
import xyz.becvold.emily.utils.IntUtils;

/**
 * @author Lukáš Bečvář on 21.11.22
 * @project Emily
 */
public class WelcomeMessage {

    // init instances
    public ConsoleUtils console = new ConsoleUtils();
    public IntUtils intUtils = new IntUtils();

    // print welcome message
    public void printWelcomeMessage() {

        // generate random number in range
        int randomInt = intUtils.randomInt(0, 3);

        if (randomInt == 0) {
            console.emilyLog("Ahoj, já jsem Emily, co pro tebe mohu udělat?");
        } else if (randomInt == 1) {
            console.emilyLog("Ahoj, já jsem Emily.");
        } else if (randomInt == 2) {
            console.emilyLog("Ahoj, já jsem Emily mohu ti pomoci?");
        } else {
            console.emilyLog("Ahoj, jmenuji se emily a všechny mé systémy jsou připraveny!");
        }
    }
}