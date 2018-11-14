package alphacare.submittable;

public abstract class User {
    public abstract int getUserId();
    public abstract String getUsername();
    public abstract String getFirstName();
    public abstract String getLastName();

    @Override
    public String toString(){
        return "User ID: " + this.getUserId() + ", Username: " + this.getUsername() + ", First Name: " + this.getFirstName() + ", Last Name: " + this.getLastName();
    }

}
