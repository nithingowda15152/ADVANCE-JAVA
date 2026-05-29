package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    private String sname;

    @Column(unique = true)
    private long phono;

    // has-a ---- many courses
    @ManyToMany
    private List<Course> courseList;

    // getters
    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public long getPhono() {
        return phono;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    // setters
    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setPhono(long phono) {
        this.phono = phono;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}