package pojo;

public class Score {
    private String studID;
    private String scoreID;
    private String courseID;
    private String score;
    private String status;

    public Score() {
    }

    public Score(String studID, String scoreID, String courseID, String score, String status) {
        this.studID = studID;
        this.scoreID = scoreID;
        this.courseID = courseID;
        this.score = score;
        this.status = status;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public String getScoreID() {
        return scoreID;
    }

    public void setScoreID(String scoreID) {
        this.scoreID = scoreID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
