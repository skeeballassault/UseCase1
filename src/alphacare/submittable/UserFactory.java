package alphacare.submittable;

/**
 * @author niko
 */

public class UserFactory {
    public static User createUser(String userType, int userId, String username, String firstName, String lastName, String dateOfBirth, String password, String email){
        if("DOCTOR".equalsIgnoreCase(userType)) return new Doctor(userId,username,firstName,lastName, dateOfBirth, password, email);
        else if("PHARMACIST".equalsIgnoreCase(userType)) return new Pharmacist(userId,username,firstName,lastName, dateOfBirth, password, email);
        else if("PATIENT".equalsIgnoreCase(userType)) return new Patient(userId,username,firstName,lastName, dateOfBirth, password, email);

        return null;
    }
}
