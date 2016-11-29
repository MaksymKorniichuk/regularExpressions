package registrationWithReflection.utilities;

public interface RegularExpressions {
    String REG_EXP_FOR_OWN_NAMES = "[A-Z](\\w| ){1,15}";

    /*
    * +38 (800) 555 24 68
    * +38(800) 555-2468
    * +380123456789
    */
    String REG_EXP_FOR_PHONE_NUMBER = "\\+\\d{2}(-| )?\\(?\\d{3}\\)? ?\\d{3}(-| )?\\d{2}(-| )?\\d{2}";

    // not number + numbers/letters
    String REG_EXP_FOR_NICKNAME = "[^0-9]\\w+";

    // from 3 to 300 symbols
    String REG_EXP_FOR_COMMENT = ".{3,300}";

    //like: "1" or "1, 3, 7"
    String REG_EXP_FOR_GROUPS = "(\\d+, )*\\d";

    // like qw-er.ty-cv@as-df-zx.com
    String REG_EXP_FOR_EMAIL = "([\\w\\.\\-]+)@([\\w\\-]+)(\\.(\\w){2,3})";

    // number from 1 to 5 numbers
    String REG_EXP_FOR_NUMBER_UP_TO_5_NUMBERS = "\\d{1,5}";

    String REG_EXP_FOR_STREET = "((\\w){1,4}.)?(\\w| ){1,15}";

    // 10-10-2000
    String REG_EXP_FOR_DATE = "\\d{2}-\\d{2}-\\d{4}";
}
