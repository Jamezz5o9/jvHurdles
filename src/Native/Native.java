package Native;

public class Native {
    private int scvId;
    private String firstName;
    private String lastName;
    private int cohortId;

    public String getScvId() {
        if(cohortId == 12){
            return "SCV-UNICORNS" +  scvId;
        }

        return "SCV"+cohortId+scvId;
    }

    public void setScvId(int scvId) {
        this.scvId = scvId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        if(cohortId != 12){
            // do nothing
        } else {
            this.cohortId = cohortId;
        }
    }
}
