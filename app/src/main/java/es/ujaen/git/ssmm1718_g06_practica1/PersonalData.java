package es.ujaen.git.ssmm1718_g06_practica1;

/**
 * Created by usuario on 04/10/2017.
 */

/*
* En PersonalData tenemos una clase que contiene los parametros de autenticación del usuario, de los que accederemos posteriormente
* con los métodos get and set.
*
*
* */
public class PersonalData {

    protected String name="";
    protected String surname="";
    protected String user="";
    protected String pass="";

    public PersonalData(String user, String pass) {
        this.user=user;
        this.pass=pass;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
