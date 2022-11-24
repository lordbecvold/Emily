package xyz.becvold.emily;

import xyz.becvold.emily.functions.actions.EmergencyShutdown;
import xyz.becvold.emily.functions.reactions.*;
import xyz.becvold.emily.utils.StringUtils;
import xyz.becvold.emily.utils.ConsoleUtils;
import java.util.Scanner;

/**
 * @author Lukáš Bečvář on 17.11.22
 * @project Emily
 */
public class EmilyCore {

    // instances initiate
    public ConsoleUtils console = new ConsoleUtils();
    public Scanner scanner = new Scanner(System.in);
    public StringUtils stringUtils = new StringUtils();

    // instances of functions
    public GreetingSystem greeting = new GreetingSystem();
    public EmergencyShutdown emergencyShutdown = new EmergencyShutdown();
    public HowAreYouQuestion howAreYouAsk = new HowAreYouQuestion();
    public WhoAreYouQuestion whoAreYouAsk = new WhoAreYouQuestion();
    public TimeQuestion timeAsk = new TimeQuestion();
    public WhatDayIsQuestion whatDayIsAsk = new WhatDayIsQuestion();

    // core function
    public void init() {

        // print prompt line
        console.printPrompt();

        // get user input
        String input = scanner.nextLine();

        // process reaction ///////////////////////////////////////////////////////////////////////

        // check if input not empty
        if (input.isEmpty()) {
            console.emilyLog("Cože? Tvá zpráva je prázdná!");
        } else {

            // validate input
            input = stringUtils.validateInput(input);

            // emergency shutdown
            if (emergencyShutdown.isShutdownInit(input)) {
                emergencyShutdown.emergencyShutdown();
            }

            // greeting
            else if (greeting.isExecute(input)) {
                greeting.onExecute(input);
            }

            // how are you ask
            else if (howAreYouAsk.isExecute(input)) {
                howAreYouAsk.onExecute(input);
            }

            // who are you ask
            else if (whoAreYouAsk.isExecute(input)) {
                whoAreYouAsk.onExecute(input);
            }

            // what is time
            else if (timeAsk.isExecute(input)) {
                timeAsk.onExecute(input);
            }

            // what is day
            else if (whatDayIsAsk.isExecute(input)) {
                whatDayIsAsk.onExecute(input);

        } else {
                // not found input msg
                console.emilyLog("Omlouvám se ale nerozuměla jsem vám :(");
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////

        // reinit this function
        init();
    }
}
