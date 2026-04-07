package model;

public enum Role {
	USER("Student"),
	user("Professor"),
    ADMIN("Admin"); 

    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
