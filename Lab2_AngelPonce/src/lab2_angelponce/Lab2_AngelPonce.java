package lab2_angelponce;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_AngelPonce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Restaurantes> restaurante = new ArrayList();
        int opcion=0, primvez=0; String usuario="", contra="";
        System.out.print("Ingrese su nombre de usuario: ");
        usuario=sc.next();
        System.out.print("Ingrese contrasenia: ");
        contra=sc.next();
        while(opcion!=3){
            if(usuario.equals("david") && contra.equals("99")){
                System.out.println("\nBienvenido...");
                System.out.println("|MENÚ GRUPO INTUR|");
                System.out.println("1. Reporte de restaurantes");
                System.out.println("2. Manejo de restaurantes");
                System.out.println("3. Salir");
                System.out.print("Opcion: ");
                opcion=sc.nextInt();
                switch(opcion){
                    case 1:
                    if(restaurante.isEmpty()){
                        System.out.println("No hay nada que reportar, no se han agregado restaurantes");
                    }
                    else{
                        System.out.println("1) Reporte 1");
                        System.out.println("2) Reporte 2");
                        System.out.println("3) Reporte 3");
                        System.out.println("4) Reporte 4" );
                        System.out.print("Opcion: ");
                        int opc=sc.nextInt();
                        switch(opc){
                            case 1://Reporte 1
                                System.out.println("Reporte según estado, cual estado desea ver (demolicion, "
                                        + "remodelacion, funcional): ");
                                String estado=sc.next();
                                while(!estado.equals("demolicion") &&  !estado.equals("remodelacion") && !estado.equals("funcional")){
                                    System.out.println("Ingrese estado nuevamente: ");
                                    estado=sc.next();
                                }
                                if(estado.equals("funcional")){
                                    System.out.println("Los de funcional son: ");
                                    for(int i=0; i<restaurante.size(); i++){
                                        if(restaurante.get(i).getEstado().equals("funcional")){
                                            System.out.println(restaurante.get(i));
                                        }
                                    }
                                }
                                else if(estado.equals("remodelacion")){
                                    System.out.println("Los de remodelacion son: ");
                                    for(int i=0; i<restaurante.size(); i++){
                                        if(restaurante.get(i).getEstado().equals("remodelacion")){
                                            System.out.println(restaurante.get(i));
                                        }
                                    }
                                }
                                else if(estado.equals("demolicion")){
                                    System.out.println("Los de demolicion son: ");
                                    for(int i=0; i<restaurante.size(); i++){
                                        if(restaurante.get(i).getEstado().equals("demolicion")){
                                            System.out.println(restaurante.get(i));
                                        }
                                    }
                                }
                                break;
                            case 2://reporte 2
                                System.out.println("Nombre, ubicación y especialidad de los restaurantes premium");
                                for(int i=0; i<restaurante.size(); i++){
                                    if(restaurante.get(i).getPremium().equals("SI")){
                                        System.out.println("Nombre: "+restaurante.get(i).getRestaurant());
                                        System.out.println("Ubicacion: "+restaurante.get(i).getUbicacion());
                                        System.out.println("Especialidad: "+restaurante.get(i).getEspecialidad());
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3://Reporte 3
                                System.out.println("Reporte segun franquicia, nombre, la especialidad y ubicación");
                                System.out.print("Ingrese nombre de la franquicia: ");
                                String franquicia=sc.next();
                                for(int i=0; i<restaurante.size(); i++){
                                    if(franquicia.equals(restaurante.get(i).getFranquicia())){
                                       System.out.println("Nombre: "+restaurante.get(i).getRestaurant());
                                       System.out.println("Ubicacion: "+restaurante.get(i).getUbicacion());
                                       System.out.println("Especialidad: "+restaurante.get(i).getEspecialidad());
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4://Reporte 4
                                System.out.println("Gerentes que pertenecen a 2 restaurantes");
                                /*for(int i=0; i<restaurante.size(); i++){
                                    int cont=0;
                                    for(int j=0; j<restaurante.size(); j++){
                                        if(restaurante.get(i).getGerente().equals(restaurante.get(j).getGerente())){
                                            cont++;
                                            if(cont==2){
                                                System.out.println("Tiene 2 restaurantes: "+restaurante.get(i).getGerente());
                                                String g = restaurante.get(j).getGerente()+"  ,";
                                                restaurante.get(j).setGerente(g);
                                                break;
                                            }
                                        }
                                    }
                                } */       
                            break;
                        }
                    }
                    
                        break;
                    case 2: //MANEJO DE RESTAURANTES
                        System.out.println("1. Agregar");
                        System.out.println("2. Listar restaurantes");
                        System.out.println("3. Modificar");
                        System.out.println("4. Eliminar");
                        System.out.print("Opción: ");
                        int opc1=sc.nextInt();
                        switch(opc1){
                            case 1:{//Agregar restaurante
                                String franquicia,restaurant,ubicacion,parqueo,juegos,gerente,especialidad,estado;
                                int emp,mesas,cajeros;
                                System.out.print("Ingrese nombre de franquicia: ");
                                franquicia=sc.next();
                                sc.nextLine();
                                System.out.print("Nombre del restaurante: ");
                                restaurant=sc.nextLine();
                                System.out.print("Ingrese ubicación: ");
                                ubicacion=sc.next();
                                /*boolean verdadero=false; 
                                while(verdadero==false){
                                    for(int i=0; i<restaurante.size(); i++){
                                        if(ubicacion.equals(restaurante.get(i).getUbicacion())){
                                            verdadero=false;
                                            break;
                                        }
                                        else{
                                            verdadero=true;
                                        }
                                    }
                                    if(verdadero==false){
                                        System.out.println("No se puede crear un restaurante en dos ubicaciones iguales.");
                                        System.out.print("Ingrese ubicación: ");
                                        ubicacion=sc.next();
                                    }
                                    else{
                                        break;
                                    }
                                }*/
                                System.out.print("Cantidad de empleados: ");
                                emp=sc.nextInt();
                                System.out.print("Parqueo? (si/no): ");
                                parqueo=sc.next();
                                while(!parqueo.equals("si") && !parqueo.equals("no")){
                                    System.out.println("Por favor solo escriba 'si' o 'no'");
                                    System.out.print("Parqueo? (si/no): ");
                                    parqueo=sc.next();
                                }
                                System.out.print("Area de juegos? (si/no): ");
                                juegos=sc.next();
                                while(!juegos.equals("si") && !juegos.equals("no")){
                                    System.out.println("Por favor solo escriba 'si' o 'no'");
                                    System.out.print("Area de juegos? (si/no): ");
                                    parqueo=sc.next();
                                }
                                System.out.print("Cajeros cantidad: ");
                                cajeros=sc.nextInt();
                                System.out.print("Ingrese estado del restaurante (remodelacion, demolicion, funcional): ");
                                estado=sc.next();
                                while(!estado.equals("remodelacion") && !estado.equals("demolicion") && !estado.equals("funcional")){
                                    System.out.println("Estado NO valido, estados válidos: remodelacion, demolicion, funcional");
                                    System.out.println("Ingrese estado del restaurante (remodelacion, demolicion, funcional): ");
                                    estado=sc.next();
                                }
                                
                                if(estado.equals("funcional")){
                                    System.out.print("Mesas cantidad: ");
                                    mesas=sc.nextInt();
                                    System.out.print("Nombre del gerente: ");
                                    gerente=sc.next().toLowerCase(); int aux=0;
                                    /*while(aux==0){
                                        aux=0;
                                        for(int i=0; i<restaurante.size(); i++){ 
                                            if(gerente.equals(restaurante.get(i).getGerente())){
                                                aux++;
                                                if(aux==2){
                                                    break;
                                                }
                                            }
                                            else{
                                                aux=1;
                                            }
                                        }
                                        if(aux==2){
                                            System.out.println("Ese gerente ya tiene 2 restaurantes, ingrese otro nombre de gerente: ");
                                            gerente=sc.next().toLowerCase();
                                            aux=0;
                                        }
                                        else{
                                            break;
                                        } 
                                    }*/
                                    
                                    System.out.print("Especialidad del restaurante: ");
                                    especialidad=sc.next();
                                    if(parqueo.equals("si") && juegos.equals("si")){
                                        String premium="SI";
                                        restaurante.add(new Restaurantes(franquicia,restaurant,ubicacion,parqueo,juegos,gerente,especialidad,estado,premium,emp,mesas,cajeros));
                                        System.out.println("Se ha agregado");
                                    }
                                    else{
                                        restaurante.add(new Restaurantes(franquicia,restaurant,ubicacion,parqueo,juegos,gerente,especialidad,estado,emp,mesas,cajeros));
                                        System.out.println("Se ha agregado");
                                    }
                                    
                                }
                                else{
                                    if(parqueo.equals("si") && juegos.equals("si")){
                                        String premium="SI";
                                        restaurante.add(new Restaurantes(franquicia,restaurant,ubicacion,parqueo,juegos,estado,emp,cajeros,premium));
                                        System.out.println("Se ha agregado");
                                    }
                                    else{
                                        restaurante.add(new Restaurantes(franquicia,restaurant,ubicacion,parqueo,juegos,estado,emp,cajeros));
                                        System.out.println("Se ha agregado");
                                    }
                                    
                                }
                            }    
                                break;
                            case 2://Listar restaurante
                                if(restaurante.isEmpty()){
                                    System.out.println("No hay restaurantes agregados");
                                }
                                else{
                                    System.out.println("\nRESTAURANTES"); 
                                    for (Object t : restaurante) {
                                        System.out.println("\nPosicion "+restaurante.indexOf(t)+": \n"+t);
                                    }
                                }
                                break;
                            case 3://Modificar
                                if(restaurante.isEmpty()){
                                    System.out.println("No hay restaurantes para modificar");
                                }
                                else{
                                    System.out.println("Ingrese posicion para modificar un restaurante");
                                    for (int i=0; i<restaurante.size(); i++) {
                                        System.out.println("En la posicion "+i+", está: "+restaurante.get(i).getRestaurant());
                                    }
                                    System.out.print("Ingrese poscion: "); int pos=sc.nextInt();
                                    String franquicia,restaurant,ubicacion,parqueo,juegos,gerente,especialidad,estado;
                                    int emp,mesas,cajeros;
                                    System.out.println("\nModificando...");
                                    System.out.print("Ingrese nombre de franquicia: ");
                                    franquicia=sc.next();
                                    sc.nextLine();
                                    restaurante.get(pos).setFranquicia(franquicia);
                                    System.out.print("Nombre del restaurante: ");
                                    restaurant=sc.nextLine();
                                    restaurante.get(pos).setRestaurant(restaurant);
                                    System.out.print("Ingrese ubicación: ");
                                    ubicacion=sc.next();
                                    restaurante.get(pos).setUbicacion(ubicacion);
                                    System.out.print("Cantidad de empleados: ");
                                    emp=sc.nextInt();
                                    restaurante.get(pos).setEmp(emp);
                                    System.out.print("Parqueo? (si/no): ");
                                    parqueo=sc.next();
                                    while(!parqueo.equals("si") && !parqueo.equals("no")){
                                        System.out.println("Por favor solo escriba 'si' o 'no'");
                                        System.out.print("Parqueo? (si/no): ");
                                        parqueo=sc.next();
                                    }
                                    restaurante.get(pos).setParqueo(parqueo);
                                    System.out.print("Area de juegos? (si/no): ");
                                    juegos=sc.next();
                                    while(!juegos.equals("si") && !juegos.equals("no")){
                                        System.out.println("Por favor solo escriba 'si' o 'no'");
                                        System.out.print("Area de juegos? (si/no): ");
                                        parqueo=sc.next();
                                    }
                                    restaurante.get(pos).setJuegos(juegos);
                                    System.out.print("Cajeros cantidad: ");
                                    cajeros=sc.nextInt();
                                    restaurante.get(pos).setCajeros(cajeros);
                                    System.out.println("Se ha modificado con exito");
                                    if(!juegos.equals("si") || !parqueo.equals("si")){
                                        restaurante.get(pos).setPremium("no");
                                    }
                                }
                                break;
                            case 4://Eliminar
                                if(restaurante.isEmpty()){
                                    System.out.println("No hay restaurantes agregados");
                                }
                                else{
                                    System.out.println("Ingrese la posicion del restaurante a eliminar ");
                                    for (int i=0; i<restaurante.size(); i++) {
                                        System.out.println("En la posicion "+i+", está: "+restaurante.get(i).getRestaurant());
                                    }
                                    System.out.print("Ingrese poscion: "); int pos=sc.nextInt();
                                    restaurante.remove(pos);
                                    System.out.println("Se ha eliminado el restaurante y todos sus datos satisfactoriamente...");
                                }                                
                                break;
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\nOpción no válida por favor ingresela nuevamente");
                }
            }//Fin del if, si ingresa los datos de usuario correcto
            else{
                System.out.println("Nombre o contrasenia incorrectos");
                System.out.print("Ingrese su nombre de usuario: ");
                usuario=sc.next();
                System.out.print("Ingrese contrasenia: ");
                contra=sc.next();
            }
        }//Fin del while que contiene al menu
    }//Fin del main 
}//Fin de la clase
    

