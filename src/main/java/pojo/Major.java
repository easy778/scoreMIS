package pojo;

public class Major {
    private String majorID;
    private String majorName;
    private String departmentID;

    public Major() {
    }

    public Major(String majorID, String majorName, String departmentID) {
        this.majorID = majorID;
        this.majorName = majorName;
        this.departmentID = departmentID;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }
}
