package criticfi_mydatos;
// Generated May 21, 2016 10:26:57 AM by Hibernate Tools 4.3.1



/**
 * Genre generated by hbm2java
 */
public class Genre  implements java.io.Serializable {


     private Integer idGenre;
     private Medium medium;
     private String typeGenre;

    public Genre() {
    }

    public Genre(Medium medium, String typeGenre) {
       this.medium = medium;
       this.typeGenre = typeGenre;
    }
   
    public Integer getIdGenre() {
        return this.idGenre;
    }
    
    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }
    public Medium getMedium() {
        return this.medium;
    }
    
    public void setMedium(Medium medium) {
        this.medium = medium;
    }
    public String getTypeGenre() {
        return this.typeGenre;
    }
    
    public void setTypeGenre(String typeGenre) {
        this.typeGenre = typeGenre;
    }




}

