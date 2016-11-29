package registrationWithReflection.controller;

import registrationWithReflection.model.Model;
import registrationWithReflection.Utilities.Validator;
import registrationWithReflection.model.entity.Address;
import registrationWithReflection.model.entity.AllGroups;
import registrationWithReflection.model.entity.Record;
import registrationWithReflection.view.View;

import java.io.InputStream;
import java.util.*;

public class Controller {
    private Model model;
    private View view;
    private Validator validator;
    private Record record;

    public Controller(Model model, View view, Validator validator) {
        this.model = model;
        this.view = view;
        this.validator = validator;

        record = new Record();
    }

    public void mainProcess(){
        InputStream source = System.in;
        Scanner scanner = new Scanner(source);

        view.printMessage(view.GREETING);

        // ENTERING_SURNAME
        view.printMessage(view.ENTERING_SURNAME);
        String surname = getOwnName(scanner);
        if(surname == null){
            return;
        }
        record.setSurname(surname);

        // ENTERING_NAME
        view.printMessage(view.ENTERING_NAME);
        String name = getOwnName(scanner);
        if(name == null){
            return;
        }
        record.setName(name);

        // ENTERING_SECONDNAME
        view.printMessage(view.ENTERING_SECONDNAME);
        String secondName = getOwnName(scanner);
        if(secondName == null){
            return;
        }
        record.setSecondName(secondName);

        // ShortNameAbbreviation
        record.setShortNameAbbreviation();
        view.printMessage("Your short abbreviation: " + record.getShortNameAbbreviation());

        // ENTERING_MOBILE_PHONE_NUMBER
        view.printMessage(view.ENTERING_MOBILE_PHONE_NUMBER);
        String mobilePhoneNumber = getPhoneNumber(scanner);
        if(mobilePhoneNumber == null){
            return;
        }
        record.setMobilePhoneNumber(mobilePhoneNumber);

        // ENTERING_ADDITIONAL_MOBILE_PHONE_NUMBER
        view.printMessage(view.ENTERING_ADDITIONAL_MOBILE_PHONE_NUMBER);
        String additionMobilePhoneNumber = getPhoneNumber(scanner);
        if(additionMobilePhoneNumber == null){
            return;
        }
        record.setAdditionMobilePhoneNumber(additionMobilePhoneNumber);

        // ENTERING_HOME_PHONE_NUMBER
        view.printMessage(view.ENTERING_HOME_PHONE_NUMBER);
        String homePhoneNumber = getPhoneNumber(scanner);
        if(homePhoneNumber == null){
            return;
        }
        record.setHomePhoneNumber(homePhoneNumber);

        // ENTERING_NICKNAME
        view.printMessage(view.ENTERING_NICKNAME);
        String nickname = getNicknameOrSkype(scanner);
        if(nickname == null){
            return;
        }
        record.setNickname(nickname);

        // ENTERING_COMMENT
        view.printMessage(view.ENTERING_COMMENT);
        String comment = getComment(scanner);
        if(comment == null){
            return;
        }
        record.setComment(comment);

        // ENTERING_GROUPS
        view.printMessage(view.ENTERING_GROUPS);
        AllGroups[] allGroups = AllGroups.values();
        view.printGroups(allGroups);
        ArrayList<Integer> integers = getNumbersOfGroups(scanner);
        if(integers == null){
            return;
        }
        ArrayList<AllGroups> chosenGroups = new ArrayList<>();
        for(Integer currentInt: integers){
            chosenGroups.add(allGroups[currentInt]);
        }
        record.setGroups(chosenGroups);

        // ENTERING_EMAIL
        view.printMessage(view.ENTERING_EMAIL);
        String email = getEmail(scanner);
        if(email == null){
            return;
        }
        record.setEmail(email);

        // ENTERING_SKYPE
        view.printMessage(view.ENTERING_SKYPE);
        String skype = getNicknameOrSkype(scanner);
        if(skype == null){
            return;
        }
        record.setSkype(skype);

        // ENTERING_ADDRESS
        view.printMessage(view.ENTERING_ADDRESS);
        Address address = getAddress(scanner);
        if(address == null){
            return;
        }
        record.setAddress(address);

        // AddressInStringFormat
        record.setAddressInStringFormat();
        view.printMessage("Your address in one row: " + record.getAddressInStringFormat());

        // ENTERING_REGISTRATION_DATE
        view.printMessage(view.ENTERING_REGISTRATION_DATE);
        Calendar enteringDate = getDate(scanner);
        if(enteringDate == null){
            return;
        }
        record.setRegistrationDate(enteringDate);

        // ENTERING_DATE_OF_LAST_CHANGES
        view.printMessage(view.ENTERING_DATE_OF_LAST_CHANGES);
        Calendar dateOfChanges = getDate(scanner);
        if(dateOfChanges == null){
            return;
        }
        record.setDateOfLastChanges(dateOfChanges);

        model.addRecordToList(record);
        System.out.println(model);
    }

    private String getOwnName(Scanner scanner) {
        String strInput = null;
        while (scanner.hasNext()) {
            strInput = scanner.nextLine();
            if(validator.validOwnNames(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return strInput;
    }

    private String getPhoneNumber(Scanner scanner) {
        String strInput = null;
        while (scanner.hasNext()) {
            strInput = scanner.nextLine();
            if(validator.validPhoneNumber(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return strInput;
    }

    private String getNicknameOrSkype(Scanner scanner) {
        String strInput = null;
        while (scanner.hasNext()) {
            strInput = scanner.nextLine();
            if(validator.validNickname(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return strInput;
    }

    private String getComment(Scanner scanner) {
        String strInput = null;
        while (scanner.hasNext()) {
            strInput = scanner.nextLine();
            if(validator.validComment(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return strInput;
    }

    private ArrayList<Integer> getNumbersOfGroups(Scanner scanner) {
        String strInput;
        ArrayList<Integer> integersFromInputString = null;
        mainCycle:
        while (scanner.hasNext()) {
            strInput = scanner.nextLine();
            if(validator.validGroups(strInput)){

                Set setIntegersFromInputString = parseIntegersFromGroupsByString(strInput);
                if(setIntegersFromInputString == null){
                    view.printMessage(view.BAD_INPUTTING_DATA);
                    continue;
                }
                integersFromInputString = new ArrayList<>(setIntegersFromInputString);

                int numberOfGroups = AllGroups.values().length;
                for (Integer integer: integersFromInputString) {
                    if(integer > numberOfGroups){
                        view.printMessage(view.BAD_INPUTTING_DATA);
                        continue mainCycle;
                    }
                }

                for (int i = 0; i < integersFromInputString.size(); i++) {
                    integersFromInputString.add(integersFromInputString.get(0) -1);
                    integersFromInputString.remove(0);
                }
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return integersFromInputString;
    }

    private String getEmail(Scanner scanner) {
        String strInput = null;
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validEmail(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        return strInput;
    }

    private Address getAddress(Scanner scanner){
        Address address = new Address();
        String strInput = null;

        // input post index
        view.printMessage(view.ENTERING_POST_INDEX);
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validNumberUpTo5Numbers(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }
        address.setPostIndex(Integer.parseInt(strInput));

        // input town
        view.printMessage(view.ENTERING_TOWN);
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validOwnNames(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }
        address.setTown(strInput);

        // input street
        view.printMessage(view.ENTERING_STREET);
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validStreet(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }
        address.setStreet(strInput);

        // input number of house
        view.printMessage(view.ENTERING_HOUSE);
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validNumberUpTo5Numbers(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }
        address.setNumberOfHouse(Integer.parseInt(strInput));

        // input number of Flat
        view.printMessage(view.ENTERING_FLAT);
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validNumberUpTo5Numbers(strInput)){
                break;
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }
        address.setNumberOfFlat(Integer.parseInt(strInput));

        return address;
    }

    // inputString like "1, 3, 7"
    private Set<Integer> parseIntegersFromGroupsByString(String inputString){
        String delimiter = ", ";
        String[] integersLikeStr = inputString.split(delimiter);
        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < integersLikeStr.length; i++) {
            try{
                integers.add(Integer.parseInt(integersLikeStr[i]));
            } catch (NumberFormatException nfe){
                return null;
            }
        }
        return integers;
    }

    private Calendar getDate(Scanner scanner){

        String strInput = null;
        Integer[] ints = new Integer[3];
        while(scanner.hasNext()){
            strInput = scanner.nextLine();
            if(validator.validDate(strInput)){
                String[] strNumbers = strInput.split("-");
                ints = new Integer[strNumbers.length];
                for (int i = 0; i < strNumbers.length; i++) {
                    ints[i] = Integer.parseInt(strNumbers[i]);
                }
                if(dayOfMonthIsCorrect(ints[0]) && monthIsCorrect(ints[1]-1) && yearIsCorrect(ints[2])){
                    break;
                }
            }
            view.printMessage(view.BAD_INPUTTING_DATA);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(ints[2], ints[1], ints[0]);

        return calendar;
    }

    private boolean dayOfMonthIsCorrect(int dayOfMonth){
        if(dayOfMonth >= 1 && dayOfMonth <= 31){
            return true;
        }
        return false;
    }

    private boolean monthIsCorrect(int month){
        if(month >= 0 && month <= 11){
            return true;
        }
        return false;
    }

    private boolean yearIsCorrect(int year){
        if(year >= 1800){
            return true;
        }
        return false;
    }
}
