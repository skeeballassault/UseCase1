package alphacare.submittable;

public class UserFactory {
    public static User createUser(String userType, int userId, String username, String firstName, String lastName, String dateOfBirth, String email){
        if("DOCTOR".equalsIgnoreCase(userType)) return new Doctor(userId,username,firstName,lastName, dateOfBirth, email);
        else if("PHARMACIST".equalsIgnoreCase(userType)) return new Pharmacist(userId,username,firstName,lastName, dateOfBirth, email);
        else if("PATIENT".equalsIgnoreCase(userType)) return new Patient(userId,username,firstName,lastName, dateOfBirth, email);

        return null;
    }
}
