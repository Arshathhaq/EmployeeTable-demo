package com.arshath.EmployeeTable.Model;



import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
public class Employees {
@Id
@SequenceGenerator(
        name = "employee_sequence",
        sequenceName = "employee_sequence",
        allocationSize = 1
)
@GeneratedValue(
        strategy = GenerationType.IDENTITY,
        generator = "employee_sequence"
)
    private int emId;
    private String emName;
    private LocalDate emDob;
    @Transient
    private Integer emAge;
    private String emEmail;
    private String emPhone;

    public Employees() {
    }

    public Employees(int emId, String emName, LocalDate emDob, String emEmail, String emPhone) {
        this.emId = emId;
        this.emName = emName;
        this.emDob = emDob;
        this.emEmail = emEmail;
        this.emPhone = emPhone;
    }

    public Employees(String emName, LocalDate emDob, String emEmail, String emPhone) {
        this.emName = emName;
        this.emDob = emDob;
        this.emEmail = emEmail;
        this.emPhone = emPhone;
    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public LocalDate getEmDob() {
        return emDob;
    }

    public void setEmDob(LocalDate emDob) {
        this.emDob = emDob;
    }

    public Integer getEmAge() {
        return Period.between(this.emDob , LocalDate.now()).getYears();
    }

    public void setEmAge(Integer emAge) {
        this.emAge = emAge;
    }

    public String getEmEmail() {
        return emEmail;
    }

    public void setEmEmail(String emEmail) {
        this.emEmail = emEmail;
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "emId=" + emId +
                ", emName='" + emName + '\'' +
                ", emDob=" + emDob +
                ", emAge=" + emAge +
                ", emEmail='" + emEmail + '\'' +
                '}';
    }
}
