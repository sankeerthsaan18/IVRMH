package controllers;


import controllers.casino.Secure.Security;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.casino.User;
import play.data.validation.Required;

public class Application extends Controller {
      public static void index1() {
        render();
    }
   
         public static void DET() {
           
             str start=str.find("order by postedAt desc").first();
        List<str> end = str.find(
            "order by postedAt desc"
        ).from(1).fetch(10);
       
        render(start,end);
        
    }
      public static void store(User use,@Required String username,@Required String phno){
          
           
         str M=new str(use,username,phno);
         
         M.save();
         flash.success("Welcome %s", username);
          redirect("/i");
        
      }

   
       public static void selection() {
        render();
    }
     public static void coni() {
        render();
    }
public static void fest() {
        render();
    }public static void resr() {
        render();
    }public static void wedding() {
        render();
    }public static void medical() {
        render();
    }public static void s(String myName) {
        render(myName);
    }public static void signin() {
        render();
    }
}