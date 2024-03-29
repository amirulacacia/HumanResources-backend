package campolina.hrgroup.hrapp.model.information;

import campolina.hrgroup.hrapp.model.applicant.Applicant;
import campolina.hrgroup.hrapp.model.employee.Employee;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "user_information")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private Long userInfoId;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Column(name = "title")
    private String title;

    @NotBlank
    @Column(name = "contact_number")
    private String contactNum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_applicant_id")
    private Applicant applicant;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_employee_id")
    private Employee employee;

    // public Applicant getApplicant() {
    //     return applicant;
    // }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    // public Employee getEmployee() {
    //     return employee;
    // }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
