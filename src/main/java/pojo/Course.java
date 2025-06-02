package pojo;

public class Course {
    private String Cno;         //课程ID(主键)
    private String Cname;       //课程名称
    private String Ctime;       //课程时间
    private String teacherID;   //授课教师ID(外键)
    private String Cplace;      //课程地点
    private String Ctype;       //课程类型
    private String Ccredit;     //课程学分
    private String Cmaxnum;     //课程最大人数
    private String Ccurnum;     //课程当前人数

    public Course() {
    }

    public Course(String cno, String cname, String ctime, String teacherID, String cplace, String ctype, String ccredit, String cmaxnum, String ccurnum) {
        Cno = cno;
        Cname = cname;
        Ctime = ctime;
        this.teacherID = teacherID;
        Cplace = cplace;
        Ctype = ctype;
        Ccredit = ccredit;
        Cmaxnum = cmaxnum;
        Ccurnum = ccurnum;
    }

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getCtime() {
        return Ctime;
    }

    public void setCtime(String ctime) {
        Ctime = ctime;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getCplace() {
        return Cplace;
    }

    public void setCplace(String cplace) {
        Cplace = cplace;
    }

    public String getCtype() {
        return Ctype;
    }

    public void setCtype(String ctype) {
        Ctype = ctype;
    }

    public String getCcredit() {
        return Ccredit;
    }

    public void setCcredit(String ccredit) {
        Ccredit = ccredit;
    }

    public String getCmaxnum() {
        return Cmaxnum;
    }

    public void setCmaxnum(String cmaxnum) {
        Cmaxnum = cmaxnum;
    }

    public String getCcurnum() {
        return Ccurnum;
    }

    public void setCcurnum(String ccurnum) {
        Ccurnum = ccurnum;
    }
}
