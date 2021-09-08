package models;

import java.util.Date;

/**
 * Clase del modelo usuario, contiene todos los atributos y
 * métodos necesarios.
 *
 * <p></p>
 * @since 2021
 * @author Christian Vargas (ChrisVarg) Developer
 */
public class Usuario {
     // atributos
    private String alias;
    private String name;
    private String lastName;
    private String telephone;
    private String email;
    private String password;
    private Date date;

    /**
     * Método Constructor de la clase Usuario
     */
    public Usuario(){

    }

    /**
     * Sobrecarga del método Constructor
     * @param alias
     * @param name
     * @param email
     * @param password
     */
    public Usuario(String alias, String name, String email, String password){
        this.alias = alias;
        this.name = alias;
        this.email = alias;
        this.password = alias;
    }

    /**
     * Obtiene la información almacenada en el atributo alias
     * @return atributo alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Asigna información al atributo alias
     * @param alias información de entrada
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Obtiene la información almacenada en el atributo name
     * @return atributo name
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna información al atributo name
     * @param name información de entrada
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la información almacenada en el atributo lastName
     * @return atributo lastName
     */
    public String getLastaName() {
        return lastName;
    }

    /**
     * Asigna información al atributo lastname
     * @param lastaName información de entrada
     */
    public void setLastaName(String lastaName) {
        this.lastName = lastaName;
    }

    /**
     * Obtiene la información almacenada en el atributo telephone
     * @return atributo telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Asigna información al atributo telephone
     * @param telephone información de entrada
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Obtiene la información almacenada en el atributo email
     * @return atributo email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna información al atributo email
     * @param email información de entrada
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la información almacenada en el atributo password
     * @return atributo password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Asigna información al atributo password
     * @param password información de entrada
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene la información almacenada en el atributo date
     * @return atributo date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Asigna información al atributo date
     * @param date información de entrada
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Muestra toda la información de todos los atributos de la clase
     * @return La información
     */
    @Override
    public String toString() {
        return "Alias: " + alias +
               "\nName: " + name +
               "\nLastName='" + lastName +
               "\nTelephone='" + telephone +
               "\nEmail='" + email +
               "\nPassword='" + password +
               "\nDate=" + date;
    }

    public Object[] toArray()
    {
        Object[] data = {alias, name, lastName, telephone, email, password, date};
        return data;
    }

}
