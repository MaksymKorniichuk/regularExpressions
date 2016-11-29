package registrationWithReflection.model.entity;

public class Address {
    private int postIndex;
    private String town;
    private String street;
    private int numberOfHouse;
    private int numberOfFlat;

    public Address() {
    }

    public Address(int postIndex, String town, String street, int numberOfHouse, int numberOfFlat) {
        this.postIndex = postIndex;
        this.town = town;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.numberOfFlat = numberOfFlat;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postIndex=" + postIndex +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                ", numberOfFlat=" + numberOfFlat +
                '}';
    }
}
