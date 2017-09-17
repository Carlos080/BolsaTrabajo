package mx.edu.itszapopan.bolsatrabajo.VO;
// Generated 14/09/2017 08:24:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="Account"
    ,catalog="bolsa_trabajo"
    , uniqueConstraints = @UniqueConstraint(columnNames="email") 
)
public class Account  implements java.io.Serializable {


     private Integer id;
     private String email;
     private String password;
     private String phone;
     private int idRole;
     private Set<Company> companies = new HashSet<Company>(0);
     private Set<Student> students = new HashSet<Student>(0);

    public Account() {
    }

	
    public Account(int idRole) {
        this.idRole = idRole;
    }
    public Account(String email, String password, String phone, int idRole, Set<Company> companies, Set<Student> students) {
       this.email = email;
       this.password = password;
       this.phone = phone;
       this.idRole = idRole;
       this.companies = companies;
       this.students = students;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idAccount", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="email", unique=true, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="phone", length=45)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="idRole", nullable=false)
    public int getIdRole() {
        return this.idRole;
    }
    
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Company> getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }




}


