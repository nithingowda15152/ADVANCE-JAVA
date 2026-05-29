package manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    private String cname;
    private int duration;

    // getters
    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public int getDuration() {
        return duration;
    }

    // setters
    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}