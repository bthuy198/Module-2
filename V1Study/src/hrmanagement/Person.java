package hrmanagement;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private boolean gender;
    private String birth;
    private String address;

    public Person() {
    }

    public Person(String name, boolean gender, String birth, String address) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner scn = new Scanner(System.in);
        this.name = scn.nextLine();
        String genders = scn.nextLine();
        if (genders.compareTo("nữ") == 0) {
            this.gender = false;
        } else this.gender = true;
        this.birth = scn.nextLine();
        this.address = scn.nextLine();
    }

    public String showInfo() {
        String genders = gender == false ? "nữ" : "nam";
        return String.format("%s: %s, ngày sinh: %s, địa chỉ: %s", name, genders, birth, address);
    }

}
