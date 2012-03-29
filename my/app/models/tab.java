package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import models.casino.User;
import play.data.validation.Required;
import play.db.jpa.JPABase;

import play.db.jpa.Model;

@Entity
public class tab extends Model {
 @Required
	public String username;

 @Required	
	public int phno;
	
@Required
    public Date postedAt;


    public tab post;


    public User use;

	public tab(User use,String username,int phno) {
                 this.use=use;
		this.username = username;
		 this.postedAt = new Date();
		this.phno = phno;
       this.save();
                       
	}

   
 
      

}