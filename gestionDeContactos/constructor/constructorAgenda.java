//Author: CabaCrD
package gestionDeContactos.constructor;
/**
 * CLASE QUE CONTIENE EL CONSTRUCTOR CON LOS DATOS DE LA EMPRESA, LOS GETTERS/SETTERS, UN STRING CON TODA LA INFORMACION DE CONTACTO Y UN COMPARADOR
 */
public class constructorAgenda implements Comparable<constructorAgenda>{

    //VARIABLES UTILES
    private String nombre;
    private String numero; //ACEPTAREMOS UN PREFIJO (Ej. +31) POR ESO DECLARO LA VARIABLE COMO STRING
    private String direccion;
    private String empresa;
    private String email;

    /**
     * CONSTRUCTOR DE LA AGENDA 
     * @param nombre NOMBRE DEL CONTACTO
     * @param numero NUMERO DEL CONTACTO
     * @param direccion DIRECCION DEL CONTACTO
     * @param empresa EMPRESA DEL CONTACTO
     * @param email DIRECCION DEL CONTACTO
     */
    public constructorAgenda( String nombre, String numero, String direccion, String empresa, String email) {

        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        this.empresa = empresa;
        this.email = email;
    }

    //LISTADO DE GETTERS Y SETTERS

    /**
     * 
     * @return NOMBRE
     */

    public String getNombre() { return nombre; }

    /**
     * 
     * @param nombre REGISTRAMOS EL NOMBRE
     */

    public void setNombre(String nombre) { this.nombre = nombre; }

    /*****/

    /**
     * 
     * @param numero REGISTRAMOS EL NUMERO
     */
    
    public void setNumero(String numero) { this.numero = numero; }
    
    /**
     * 
     * @return NUMERO
     */

    public String getNumero() { return numero; }

    /*****/

    /**
     * 
     * @param direccion REGISTRA LA DIRECCION
     */

    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    /**
     * 
     * @return DEVUELVE LA DIRECCION
     */

    public String getDireccion() { return direccion; }

    /*****/

    /**
     * 
     * @param empresa REGISTRA LA EMPRESA
     */

    public void setEmpresa(String empresa) { this.empresa = empresa; }
    
    /**
     * 
     * @return DEVUELVE LA EMPRESA
     */

    public String getEmpresa() { return empresa; }

    /*****/

    /**
     * 
     * @param email REGISTRA EL EMAIL
     */

    public void setEmail(String email) { this.email = email; }
    
    /**
     * 
     * @return DEVUELVE EL EMAIL
     */

    public String getEmail() { return email; }

    /** PARA MOSTRAR TODOS LOS CONTACTOS ALMACENADOS **/

    /**
     * 
     * @return UN STRING CON TODA LA INFORMACION DE LOS CONTACTOS QUE TENGAMOS REGISTRADOS
     */

    public String getContactos(){

        String infoContactos = 
        "\n------------------------------"
        + "\n Nombre : " + nombre 
        + "\n Número: " + numero 
        + "\n Dirección: " + direccion 
        + "\n Empresa: " + empresa 
        + "\n Correo Electrónico: " + email
        + "\n------------------------------\n";
        
        return infoContactos;

    }

    @Override

    /**
     * METODO DE COMPARACION CON EL NUMERO
     */

    public int compareTo(constructorAgenda contacto) {

        return this.numero.compareTo(contacto.getNumero());
    }


}
