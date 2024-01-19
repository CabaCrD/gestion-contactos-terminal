//Author: CabaCrD

package gestionDeContactos.funciones;

import java.util.*;

import gestionDeContactos.constructor.constructorAgenda;
import gestionDeContactos.util.validaciones;

/**
 * CLASE PUBLICA FUNCIONES
 */
public class funciones {

    /**
     * VARIABLE QUE HEMOS DECLARADO PARA HACER FUNCIONAR NUESTRO PROGRAMA
     */
    static Scanner key = new Scanner(System.in); //DECLARAMOS EL SCANNER
    static constructorAgenda contacto = new constructorAgenda(null, null, null, null, null);//DECLARAMOS EL CONSTRUCTOR
    public static TreeSet<constructorAgenda> listado = new TreeSet<>();//DECLARAMOS UN TREESET PARA ALMACENAR LOS CONTACTOS
    public static String user = System.getProperty("user.name");//OBTENEMOS EL NOMBRE DE USUARIO
    public static String nombre;
    public static String numero; //ACEPTAREMOS UN PREFIJO (Ej. +31) POR ESO DECLARO LA VARIABLE COMO STRING
    public static String direccion;
    public static String empresa;
    public static String email;
    
    /**
     * FUNCION PARA INICIAR EL PROGRAMA
     */
    public static void iniciarPrograma(){

        //cargarFichero(constructorAgenda);
        
        int menu;

        try {

            do {

                System.out.println("\n Bienvenido a su agenda");
                System.out.println("\n Usuario: " + user);
                System.out.println("\n1. Consultar Contactos");
                System.out.println("2. Insertar Contactos");
                System.out.println("3. Eliminar Contactos");
                System.out.println("4. Salir");
                System.out.println("");
                System.out.println("Seleccione una opción: ");
                menu = key.nextInt() ;

                switch(menu){

                    case 1: //CONSULTAREMOS LOS CONTACTOS

                        consultarContactos();

                        break;

                    case 2: //INSERTAREMOS LOS CONTACTOS
                        
                        insertarContacto();

                        break;

                    case 3: //ELIMINAREMOS LOS CONTACTOS
                        
                        eliminarContacto();

                        break;

                    case 4: // SALIR DEL PROGRAMA

                        System.out.println("Cerrando el programa");
                        System.exit(0);

                        break;

                    default:

                        System.out.println("Opción no disponible");

                        break;
                }

            } while (menu != 4);

        } catch (Exception e) {

            System.out.print("Error inesperado: " + e);

        }

    }
    
    /**
     * MIRAMOS TODOS NUESTROSD CONTACTOS REGISTRADO
     * @return BOOLEANO
     */
    public static boolean consultarContactos(){

        for (constructorAgenda agenda : listado) {

            System.out.println(agenda.getContactos());

        }

        if (listado.size() > 0) {

            return listado != null; 

        }else{

            System.out.print("\n La agenda se encuentra vacía \n");
            
            return false;

        }
    }       

    /**
     * METODO PARA INSERTAR UN CONTACTO
     */
    public static void insertarContacto(){
        
        
        try {

            key.nextLine(); //LIMPIAMOS BUFFER

            // NOMBRE

            do {

                System.out.println("Inserte el nombre del contacto: *");
                nombre = key.nextLine();

            } while (validaciones.validarNombre(nombre) != true);

            //NUMERO

            do {

                System.out.println("Inserte el numero del contacto: *");
                numero = key.nextLine();             
                
                if(validaciones.numeroExiste(numero) == 1 ){

                    System.out.print("El número " + numero + " ya está registrado en el sistema");
                    return;
                    
                }

            } while (validaciones.validarNumero(numero) != true);

            //DIRECCION

            do {

                System.out.println("Inserte el direccion del contacto (opcional):");
                direccion = key.nextLine();

               

            } while (validaciones.validarDireccion(direccion) != true);

            //EMPRESA

            do {
              
                System.out.println("Inserte el empresa del contacto (opcional):");
                empresa = key.nextLine();

            } while (validaciones.validarEmpresa(empresa) != true);     
        
            //EMAIL
            do {
              
                System.out.println("Inserte el correo electronico del contacto (opcional):");
                email = key.nextLine();

            } while (validaciones.validarEmail(email) != true);


        //PARA ALMACENAR EL CODIGO 
            constructorAgenda  nuevoContacto = new constructorAgenda (nombre, numero, direccion, empresa, email);
    
            if(listado.add(nuevoContacto)){

                System.out.print("Contacto guardado");

            }else{

                System.out.print("No se pudo guardar el contacto");

            }
    
        } catch (Exception e) {

            System.out.print("Error inesperado: " + e);

        }
    
    }

    /**
     * METODO PARA ELIMINAR CONTACTOS
     */
    public static void eliminarContacto(){

        try {

            key.nextLine(); //ELIMINAMOS BUFFER

            do {
                
                System.out.println("Inserte el numero del contacto: *");
                numero = key.nextLine();

                if(validaciones.numeroExiste(numero) == 0){

                    System.out.print("El número no se encuentra registrado");
                    return;

                }
                
            }while (validaciones.validarNumero(numero) != true );   
            
            constructorAgenda contacto = new constructorAgenda(null, numero, null, null, null);

            if(listado.remove(contacto)){

                System.out.print("Contacto eliminado");

            }else{

                System.out.print("No se pudo eliminar el contacto");

            }

        } catch (Exception e) {

            System.out.println("Error inesperado: " + e);
        

        }

    }
}
