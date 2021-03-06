package mx.edu.itszapopan.bolsatrabajo.VO;
// Generated 14/09/2017 08:24:27 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * File generated by hbm2java
 */
@Entity
@Table(name="File"
    ,catalog="bolsa_trabajo"
)
public class File  implements java.io.Serializable {


     private Integer idFile;
     private DocumentData documentData;
     private byte[] file;

    public File() {
    }

    public File(DocumentData documentData, byte[] file) {
       this.documentData = documentData;
       this.file = file;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idFile", unique=true, nullable=false)
    public Integer getIdFile() {
        return this.idFile;
    }
    
    public void setIdFile(Integer idFile) {
        this.idFile = idFile;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDocumentData", nullable=false)
    public DocumentData getDocumentData() {
        return this.documentData;
    }
    
    public void setDocumentData(DocumentData documentData) {
        this.documentData = documentData;
    }

    
    @Column(name="file", nullable=false)
    public byte[] getFile() {
        return this.file;
    }
    
    public void setFile(byte[] file) {
        this.file = file;
    }




}


