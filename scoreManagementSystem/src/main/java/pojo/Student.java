package pojo;

import java.io.Serializable;
import java.util.Date;

public class Student extends Account implements Serializable {
    private String name;            //姓名
    private String birthday;        //生日
    private String gender;          //性别
    private String email;           //邮箱
    private String phone;           //联系方式
    private String address;         //家庭住址
    private String major;           //专业
    private String department;      //学院
    private String gradeLevel;      //年级
    public Student() {}

    public Student(String id, String pwd, String role, String name, String birthday, String gender, String email, String phone, String address, String major, String department) {
        super(id, pwd, role);
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.major = major;
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
