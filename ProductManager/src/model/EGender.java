package model;

public enum EGender {
    MALE(1),
    FEMALE(2),
    OTHER(3);

    private String value;
    private int id;

    EGender(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static EGender toGender(int id) {
        for (EGender gender : values()) {
            if (gender.id == id) {
                return gender;
            }
        }
        return null;
    }
    public static EGender getEGenderByName(String name) {
        for (EGender gender : values()) {
            if (gender.toString().equals(name)) {
                return gender;
            }
        }
        return null;
    }
}
