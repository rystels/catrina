/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina1.entities;

import java.util.Date;
import mx.itson.catrina.enumns.Type1;

/**
 *
 * @author ryst2
 */
public class Transactions {
  private Date date ;
    private String description;
    private double amount;
    private Type1 type;
   
   
   
   
   
   
   /*public Recipe deserealize(String json ){
        Reci recipe =new Recipe();
        try{
            recipe=new Gson().fromJson(json,Recipe.class );
            
        }catch(Exception ex){
            System.err.println("Ocurrio un error :" + ex.getMessage());
            
        }*/

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Type1 getType() {
        return type;
    }

    public void setType(Type1 type) {
        this.type = type;
    }
   
    
    
}
