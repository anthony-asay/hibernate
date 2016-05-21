package criticfi_mydatos;
// Generated May 21, 2016 10:26:57 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Review generated by hbm2java
 */
public class Review  implements java.io.Serializable {


     private Integer idReview;
     private User user;
     private int idItem;
     private Date dateCreated;
     private BigDecimal rating;
     private String review;
     private String slug;

    public Review() {
    }

    public Review(User user, int idItem, Date dateCreated, BigDecimal rating, String review, String slug) {
       this.user = user;
       this.idItem = idItem;
       this.dateCreated = dateCreated;
       this.rating = rating;
       this.review = review;
       this.slug = slug;
    }
   
    public Integer getIdReview() {
        return this.idReview;
    }
    
    public void setIdReview(Integer idReview) {
        this.idReview = idReview;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public int getIdItem() {
        return this.idItem;
    }
    
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public BigDecimal getRating() {
        return this.rating;
    }
    
    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }
    public String getReview() {
        return this.review;
    }
    
    public void setReview(String review) {
        this.review = review;
    }
    public String getSlug() {
        return this.slug;
    }
    
    public void setSlug(String slug) {
        this.slug = slug;
    }




}


