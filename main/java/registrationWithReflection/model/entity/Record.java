package registrationWithReflection.model.entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Record {
    private String surname;
    private String name;
    private String secondName;
    private String shortNameAbbreviation;
    private String nickname;
    private String comment;
    private ArrayList<AllGroups> groups;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String additionMobilePhoneNumber;
    private String email;
    private String skype;
    private Address address;
    private String addressInStringFormat;
    private Calendar registrationDate;
    private Calendar dateOfLastChanges;

    public Record() {
    }

    public void setShortNameAbbreviation() {
        this.shortNameAbbreviation = surname + ' ' + name.substring(0, 1) + '.';
    }

    public void setAddressInStringFormat(){
        addressInStringFormat = address.getPostIndex() + " " + address.getTown() + ", " + address.getStreet() + " st. "
                + address.getNumberOfHouse() + ", " + address.getNumberOfFlat();
    }

    @Override
    public String toString() {
        return "Record{" +
                "\nsurname= '" + surname + '\'' +
                "\nname= '" + name + '\'' +
                "\nsecondName= '" + secondName + '\'' +
                "\nshortNameAbbreviation= '" + shortNameAbbreviation + '\'' +
                "\nnickname= '" + nickname + '\'' +
                "\ncomment= '" + comment + '\'' +
                "\ngroups= " + groups +
                "\nhomePhoneNumber= '" + homePhoneNumber + '\'' +
                "\nmobilePhoneNumber= '" + mobilePhoneNumber + '\'' +
                "\nadditionMobilePhoneNumber= '" + additionMobilePhoneNumber + '\'' +
                "\nemail= '" + email + '\'' +
                "\nskype= '" + skype + '\'' +
                "\naddress= " + address +
                "\naddressInStringFormat= '" + addressInStringFormat + '\'' +
                "\nregistrationDate= " + registrationDate.get(Calendar.DAY_OF_MONTH) + "-" + registrationDate.get(Calendar.MONTH) + "-" + registrationDate.get(Calendar.YEAR) +
                "\ndateOfLastChanges= " + dateOfLastChanges.get(Calendar.DAY_OF_MONTH) + "-" + dateOfLastChanges.get(Calendar.MONTH) + "-" + dateOfLastChanges.get(Calendar.YEAR) +
                '}';
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroups(ArrayList<AllGroups> groups) {
        this.groups = groups;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setAdditionMobilePhoneNumber(String additionMobilePhoneNumber) {
        this.additionMobilePhoneNumber = additionMobilePhoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setDateOfLastChanges(Calendar dateOfLastChanges) {
        this.dateOfLastChanges = dateOfLastChanges;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getShortNameAbbreviation() {
        return shortNameAbbreviation;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public ArrayList<AllGroups> getGroups() {
        return groups;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getAdditionMobilePhoneNumber() {
        return additionMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

    public String getAddressInStringFormat() {
        return addressInStringFormat;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public Calendar getDateOfLastChanges() {
        return dateOfLastChanges;
    }
}
