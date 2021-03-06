package criticfi_mydatos;
// Generated May 21, 2016 10:26:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer idUser;
     private String nameUser;
     private String password;
     private Date dateCreated;
     private Date dateBirth;
     private String email;
     private Integer idFb;
     private Integer idTw;
     private String slug;
     private Set reviews = new HashSet(0);

    public User() {
    }

	
    public User(String nameUser, String password, Date dateCreated, String email, String slug) {
        this.nameUser = nameUser;
        this.password = password;
        this.dateCreated = dateCreated;
        this.email = email;
        this.slug = slug;
    }
    public User(String nameUser, String password, Date dateCreated, Date dateBirth, String email, Integer idFb, Integer idTw, String slug, Set reviews) {
       this.nameUser = nameUser;
       this.password = password;
       this.dateCreated = dateCreated;
       this.dateBirth = dateBirth;
       this.email = email;
       this.idFb = idFb;
       this.idTw = idTw;
       this.slug = slug;
       this.reviews = reviews;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getNameUser() {
        return this.nameUser;
    }
    
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getDateBirth() {
        return this.dateBirth;
    }
    
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getIdFb() {
        return this.idFb;
    }
    
    public void setIdFb(Integer idFb) {
        this.idFb = idFb;
    }
    public Integer getIdTw() {
        return this.idTw;
    }
    
    public void setIdTw(Integer idTw) {
        this.idTw = idTw;
    }
    public String getSlug() {
        return this.slug;
    }
    
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public Set getReviews() {
        return this.reviews;
    }
    
    public void setReviews(Set reviews) {
        this.reviews = reviews;
    }




}


