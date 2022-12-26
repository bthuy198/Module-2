package model;

public enum EGender {
    MALE("Male", 1),
    FEMALE("Female", 2),
    OTHER("Other", 3);

    private String value;
    private int id;

    EGender(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
