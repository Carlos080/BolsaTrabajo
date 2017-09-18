package mx.edu.itszapopan.bolsatrabajo.VO;
// Generated 14/09/2017 08:24:27 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vacancy generated by hbm2java
 */
@Entity
@Table(name="Vacancy"
    ,catalog="bolsa_trabajo"
)
public class Vacancy  implements java.io.Serializable {


     private Integer idVacancy;
     private Career career;
     private Company company;
     private String name;
     private String description;
     private int sueldo;
     private String workShift;
     private String jornada;
     private Date postDate;
     private boolean status;
     private Date modificationDate;
     private String closingComment;
     private boolean validation;
     private String idCountry;

    public Vacancy() {
    }

    public Vacancy(Career career, Company company, String name, String description, int sueldo, String workShift, String jornada, Date postDate, boolean status, Date modificationDate, String closingComment, boolean validation, String idCountry) {
       this.career = career;
       this.company = company;
       this.name = name;
       this.description = description;
       this.sueldo = sueldo;
       this.workShift = workShift;
       this.jornada = jornada;
       this.postDate = postDate;
       this.status = status;
       this.modificationDate = modificationDate;
       this.closingComment = closingComment;
       this.validation = validation;
       this.idCountry = idCountry;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idVacancy", unique=true, nullable=false)
    public Integer getIdVacancy() {
        return this.idVacancy;
    }
    
    public void setIdVacancy(Integer idVacancy) {
        this.idVacancy = idVacancy;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCareer", nullable=false)
    public Career getCareer() {
        return this.career;
    }
    
    public void setCareer(Career career) {
        this.career = career;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCompany", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", nullable=false, length=350)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="sueldo", nullable=false)
    public int getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
    @Column(name="workShift", nullable=false, length=45)
    public String getWorkShift() {
        return this.workShift;
    }
    
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    
    @Column(name="jornada", nullable=false, length=45)
    public String getJornada() {
        return this.jornada;
    }
    
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="postDate", nullable=false, length=10)
    public Date getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    
    @Column(name="status", nullable=false)
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="modificationDate", nullable=false, length=10)
    public Date getModificationDate() {
        return this.modificationDate;
    }
    
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    
    @Column(name="closingComment", nullable=false, length=300)
    public String getClosingComment() {
        return this.closingComment;
    }
    
    public void setClosingComment(String closingComment) {
        this.closingComment = closingComment;
    }

    
    @Column(name="validation", nullable=false)
    public boolean isValidation() {
        return this.validation;
    }
    
    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    
    @Column(name="idCountry", nullable=false, length=45)
    public String getIdCountry() {
        return this.idCountry;
    }
    
    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }




}


