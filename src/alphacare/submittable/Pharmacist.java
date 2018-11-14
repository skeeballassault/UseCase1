package alphacare.submittable;

public class Pharmacist extends User {
    private int userId;
    private String username;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

    public Pharmacist(int userId, String username, String firstName, String lastName, String dateOfBirth, String email) {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    @Override
    public String getDateOfBirth() { return dateOfBirth; }

    @Override
    public String getEmail() { return email; }

    @Override
    public int getUserId() {
        return userId;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}