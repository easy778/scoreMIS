package pojo;

public class Teacher extends Account{
     private String name;
     private String gender;
     private String department;

     public Teacher(String id, String pwd, String role, String name, String gender, String department) {
          super(id, pwd, role);
          this.name = name;
          this.gender = gender;
          this.department = department;
     }

     public Teacher() {
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }
}
