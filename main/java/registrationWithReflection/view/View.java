package registrationWithReflection.view;

import registrationWithReflection.model.entity.AllGroups;

public class View {
    // Text's constants
    public final String GREETING = "Welcome! Please, enter your data.";
    public final String ENTERING_NAME = "Please, enter your name (e.g. Ivan):";
    public final String ENTERING_SURNAME = "Please, enter your surname (e.g. Ivanov):";
    public final String ENTERING_SECONDNAME = "Please, enter your second name (e.g. Ivanovich):";
    public final String ENTERING_MOBILE_PHONE_NUMBER = "Please, enter your mobile phone number (e.g. +38(800)555-2468):";
    public final String ENTERING_ADDITIONAL_MOBILE_PHONE_NUMBER = "Please, enter your additional mobile phone number (e.g. +38(800)555-2468):";
    public final String ENTERING_HOME_PHONE_NUMBER = "Please, enter your home phone number (e.g. +38(044)123-4567):";
    public final String ENTERING_NICKNAME = "Please, enter your nickname (it can not starts from number):";
    public final String ENTERING_COMMENT = "Please, enter your comment (from 3 to 3000 symbols):";
    public final String ENTERING_GROUPS = "Please, enter numbers of your groups from next list (like \"1, 3, 7\").\nGroups:";
    public final String ENTERING_EMAIL = "Please, enter your email:";
    public final String ENTERING_SKYPE = "Please, enter your skype:";
    public final String ENTERING_ADDRESS = "Please, enter next items of your address";
    public final String ENTERING_POST_INDEX = "Please, enter your post index:";
    public final String ENTERING_TOWN = "Please, enter your town:";
    public final String ENTERING_STREET = "Please, enter your street:";
    public final String ENTERING_HOUSE = "Please, enter number of your house:";
    public final String ENTERING_FLAT = "Please, enter number of your flat:";
    public final String ENTERING_REGISTRATION_DATE = "Please, enter date of entering record in format \"dd-mm-yyyy\":";
    public final String ENTERING_DATE_OF_LAST_CHANGES = "Please, enter date of last changes in record in format \"dd-mm-yyyy\":";

    public final String BAD_INPUTTING_DATA = "Sorry, but this data do NOT fit. Please, enter appropriate data:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printGroups(AllGroups[] allGroups){
        for (int i = 0; i < allGroups.length; i++) {
            System.out.println(i+1 + ") " + allGroups[i].toString());
        }
    }

}
