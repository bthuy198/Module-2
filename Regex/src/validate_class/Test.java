package validate_class;

public class Test {
    public static void main(String[] args) {
        String[] nameClass = new String[]{"C0318G", "M0318G", "P0323A", "P8458N"};
        ValidateClass validateClass = new ValidateClass();
        for (String name : nameClass) {
            boolean isValid = validateClass.validate(name);
            System.out.println("Class " + name + " is valid: " + isValid);
        }
    }
}
