package registrationWithReflection.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private Pattern patternForValidOwnNames;
    private Pattern patternForValidPhoneNumber;
    private Pattern patternForValidNickname;
    private Pattern patternForValidComment;
    private Pattern patternForValidGroups;
    private Pattern patternForValidEmail;
    private Pattern patternForValidPostIndex;
    private Pattern patternForValidStreet;
    private Pattern patternForValidDate;

    // for custom regex
    public boolean validStringByRegularExpression(String inputString, String inputRegularExpression){
        return inputString.matches(inputRegularExpression);
    }

    public boolean validOwnNames(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidOwnNames, RegularExpressions.REG_EXP_FOR_OWN_NAMES);

        if(patternForValidOwnNames == null){
            patternForValidOwnNames = Pattern.compile(RegularExpressions.REG_EXP_FOR_OWN_NAMES);
        }
        Matcher matcher = patternForValidOwnNames.matcher(inputString);
        return matcher.matches();
    }

    public boolean validPhoneNumber(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidPhoneNumber, RegularExpressions.REG_EXP_FOR_PHONE_NUMBER);

        if(patternForValidPhoneNumber == null){
            patternForValidPhoneNumber = Pattern.compile(RegularExpressions.REG_EXP_FOR_PHONE_NUMBER);
        }
        Matcher matcher = patternForValidPhoneNumber.matcher(inputString);
        return matcher.matches();
    }

    public boolean validNickname(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidNickname, RegularExpressions.REG_EXP_FOR_NICKNAME);

        if(patternForValidNickname == null){
            patternForValidNickname = Pattern.compile(RegularExpressions.REG_EXP_FOR_NICKNAME);
        }
        Matcher matcher = patternForValidNickname.matcher(inputString);
        return matcher.matches();
    }

    public boolean validComment(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidComment, RegularExpressions.REG_EXP_FOR_COMMENT);

        if(patternForValidComment == null){
            patternForValidComment = Pattern.compile(RegularExpressions.REG_EXP_FOR_COMMENT);
        }
        Matcher matcher = patternForValidComment.matcher(inputString);
        return matcher.matches();
    }

    public boolean validGroups(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidGroups, RegularExpressions.REG_EXP_FOR_GROUPS);

        if(patternForValidGroups == null){
            patternForValidGroups = Pattern.compile(RegularExpressions.REG_EXP_FOR_GROUPS);
        }
        Matcher matcher = patternForValidGroups.matcher(inputString);
        return matcher.matches();
    }

    public boolean validEmail(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidEmail, RegularExpressions.REG_EXP_FOR_EMAIL);

        if(patternForValidEmail == null){
            patternForValidEmail = Pattern.compile(RegularExpressions.REG_EXP_FOR_EMAIL);
        }
        Matcher matcher = patternForValidEmail.matcher(inputString);
        return matcher.matches();
    }

    public boolean validNumberUpTo5Numbers(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidPostIndex, RegularExpressions.REG_EXP_FOR_NUMBER_UP_TO_5_NUMBERS);

        if(patternForValidPostIndex == null){
            patternForValidPostIndex = Pattern.compile(RegularExpressions.REG_EXP_FOR_NUMBER_UP_TO_5_NUMBERS);
        }
        Matcher matcher = patternForValidPostIndex.matcher(inputString);
        return matcher.matches();
    }

    public boolean validStreet(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidStreet, RegularExpressions.REG_EXP_FOR_STREET);

        if(patternForValidStreet == null){
            patternForValidStreet = Pattern.compile(RegularExpressions.REG_EXP_FOR_STREET);
        }
        Matcher matcher = patternForValidStreet.matcher(inputString);
        return matcher.matches();
    }

    public boolean validDate(String inputString){

        //return validationWUsingPatternAndMatcher(inputString, patternForValidDate, RegularExpressions.REG_EXP_FOR_DATE);

        if(patternForValidDate == null){
            patternForValidDate = Pattern.compile(RegularExpressions.REG_EXP_FOR_DATE);
        }
        Matcher matcher = patternForValidDate.matcher(inputString);
        return matcher.matches();
    }

    // universal template:

    /*private boolean validationWUsingPatternAndMatcher(String inputString, Pattern pattern, String regExp){
        if(pattern == null){
            pattern = Pattern.compile(regExp);
        }
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }*/

}
