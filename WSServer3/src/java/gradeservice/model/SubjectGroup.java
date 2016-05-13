package gradeservice.model;
// Generated May 11, 2016 1:03:45 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * SubjectGroup generated by hbm2java
 */
@Entity
@Table(name = "SubjectGroup", schema = "dbo", catalog = "WSAppDB2"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectGroup implements java.io.Serializable {

    private int id;
    private Student student;
    private Subject subject;
    private String name;

    public SubjectGroup() {
    }

    public SubjectGroup(int id) {
        this.id = id;
    }

    public SubjectGroup(int id, Student student, Subject subject, String name) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.name = name;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Column(name = "name", length = 10)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
