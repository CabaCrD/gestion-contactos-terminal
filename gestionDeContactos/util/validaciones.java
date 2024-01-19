//Author: CabaCrD

package gestionDeContactos.util;

import gestionDeContactos.constructor.constructorAgenda;
import gestionDeContactos.funciones.funciones;
/**
 * CLASE QUE CONTIENE LAS FUNCIONES PARA VALIDAR LA ENTRADA DE DATOS
 */
public class validaciones {
    
    /**
     * FUNCION PARA VALIDAR NOMBER
     * @param nombre VARIABLE QUE VALIDAREMOS
     * @return VARIABLE BOOLEANA
    */
    public static boolean validarNombre(String nombre) {

        if (nombre.length() == 0 || nombre == ""  || nombre == null){

            System.out.println("Campo nombre obligatorio");
            return false;

        }

        if(nombre.length() > 40) {

            System.out.println("Valor introducido demasiado extenso (max. 40 carácteres)");
            return false;

        }

        return true;
    }
    /**
     * VALIDAREMOS EL NUMERO INTRODUCIDO
     * @param numero VARIABLE QUE VALIDAREMOS
     * @return VARIABLE BOOLEANA
     */
    public static boolean validarNumero (String numero) {

        if (numero.length() == 0 || numero == ""  || numero == null){

            System.out.println("Campo numero obligatorio");
            return false;
        
        }

        if(numero.length() > 15) {

            System.out.println("Valor introducido demasiado extenso (max. 15 carácteres)");
            return false;
            
        }

        if(numero.matches("^\\+?[0-9]+") == false){

            System.out.print("Formato introducido invalido\n");
            return false;

        }

        return true;

    }
    /**
     * FUNCION PARA VALIDAR LA EMPRESA (SI INTRODUCIMOS DATOS)
     * @param empresa VARIABLE QUE VALIDAREMOS
     * @return VARIABLE BOOLEANA
     */
    public static boolean validarEmpresa (String empresa){

        //AL SER UN CAMPO OPCIONAL, NO EXIGIREMOS QUE SE COMPLETE
        if (empresa.length() == 0 || empresa == "" || empresa == null){

            if(empresa.length() > 40) {

                System.out.println("Valor introducido demasiado extenso (max. 40 carácteres)");
                return false;
                
            }
                
            }else{

                return true;

            }

        return true;

    }
    /**
     * FUNCION PARA VALIDAR LA DIRECCION (SI INTRODUCIMOS DATOS)
     * @param direccion VARIABLE QUE VALIDAREMOS
     * @return VARIABLE BOOLEANA
     */
    public static boolean validarDireccion(String direccion){

        //AL SER UN CAMPO OPCIONAL, NO EXIGIREMOS QUE SE COMPLETE
        if (direccion.length() == 0 || direccion == "" || direccion == null){

            if(direccion.length() > 40) {

                System.out.println("Valor introducido demasiado extenso (max. 40 carácteres)");
                return false;
                
            }else{

                return true;

            }

        }
        
        return true;

    }
    /**
     * FUNCION PARA VALIDAR EL EMAIL (SI INTRODUCIMOS DATOS)
     * @param email VARIABLE QUE VALIDAREMOS
     * @return VARIABLE BOOLEANA
     */
    public static boolean validarEmail(String email){
        

        //AL SER UN CAMPO OPCIONAL, NO EXIGIREMOS QUE SE COMPLETE
        if (email.length() == 0 || email == "" || email == null){

            return true;

        }

        if (email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b") == false){

            System.out.println("Formato de correo invalido");
            return false;

        }

        if(email.length() > 40) {

            System.out.println("Valor introducido demasiado extenso (max. 40 carácteres)");
            return false;
            
        }

        return true;
    }
    /**
     * COMPROBAREMOS SI EL NUMERO EXISTE
     * @param numero //VARIABLE QUE COMPROBAREMOS
     * @return 1 SI EXISTE, 0 SI NO EXISTE
     */
    public static int numeroExiste(String numero){
        
         /** ASI COMPROBAREMOS QUE EL NUMERO EXISTE**/
         for (constructorAgenda agenda : funciones.listado) {

            if(agenda.getNumero().equals(numero)){

            return 1 ; //SI DEVUELVE 1 ES QUE EL NUMERO EXISTE
            
            }

        }

        return 0;

    }
}
