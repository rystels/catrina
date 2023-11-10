/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina1.entities;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import mx.itson.catrina.enumns.Type1;

/**
 *
 * @author ryst2
 */
public class Statement {

    //lo puse con string por que eran varios numeros 
    private String account;
    private String clabe;
    private String currency;
    //Hice una lista de tipo Transections para poder llamar a cualquier transaccion con transactions
    private List<Transactions> transactions;
    private Customer customer;

    //Creare un metodo para deseralizar el metodo
    /**
     *
     * @param json es el tipo de archivo que deserealiza al adjuntarlo
     * @return statement
     */
    public Statement deserealize(String json) {
        Statement statement = new Statement();
        try {
            statement = new Gson().fromJson(json, Statement.class);

        } catch (Exception ex) {
            System.err.println("Ocurrio un error :" + ex.getMessage());

        }
        return statement;

    }

    /**
     *
     * @param mes es para guardar el mes seleccionado
     * @param disorderedTransactions guarda la lista de transactions como la
     * recibe en disorderedTransactions
     * @return
     */
    //List<Transactions> le pasare esta lista de las transacciones a movimientosdesordenados
    public List<Transactions> obtenerListaMovimientos(int mes, List<Transactions> disorderedTransactions) {
        List<Transactions> orderedTransactions = new ArrayList<>();

        for (Transactions movimiento : disorderedTransactions) {
            if (movimiento.getDate().getMonth() == mes) {
                orderedTransactions.add(movimiento);
            }
        }
        //el sort sirve para ordenar la lista desordenada de movimientos por fecha 
        //el mov1 es la lista desordenada ,el mov2 es ya ordenada 
        //mov1.getdate mandara a llamar el metodo getDate 
        orderedTransactions.sort((mov1, mov2) -> mov1.getDate().compareTo(mov2.getDate()));
        return orderedTransactions;

    }
       
    

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
