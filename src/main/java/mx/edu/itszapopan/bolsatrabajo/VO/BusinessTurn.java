package mx.edu.itszapopan.bolsatrabajo.VO;
// Generated 14/09/2017 08:24:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BusinessTurn generated by hbm2java
 */
@Entity
@Table(name="BusinessTurn"
    ,catalog="bolsa_trabajo"
)
public class BusinessTurn  implements java.io.Serializable {


     private int idBusinessTurn;
     private String businessTurn;
     private Set<Company> companies = new HashSet<Company>(0);

    public BusinessTurn() {
    }

	
    public BusinessTurn(int idBusinessTurn, String businessTurn) {
        this.idBusinessTurn = idBusinessTurn;
        this.businessTurn = businessTurn;
    }
    public BusinessTurn(int idBusinessTurn, String businessTurn, Set<Company> companies) {
       this.idBusinessTurn = idBusinessTurn;
       this.businessTurn = businessTurn;
       this.companies = companies;
    }
   
     @Id 

    
    @Column(name="idBusinessTurn", unique=true, nullable=false)
    public int getIdBusinessTurn() {
        return this.idBusinessTurn;
    }
    
    public void setIdBusinessTurn(int idBusinessTurn) {
        this.idBusinessTurn = idBusinessTurn;
    }

    
    @Column(name="BusinessTurn", nullable=false, length=45)
    public String getBusinessTurn() {
        return this.businessTurn;
    }
    
    public void setBusinessTurn(String businessTurn) {
        this.businessTurn = businessTurn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessTurn")
    public Set<Company> getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }




}


