package lab2_angelponce;

public class Restaurantes {
    private String franquicia,restaurant,ubicacion,parqueo,juegos,gerente=" ",especialidad=" ",estado,premium="no";

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public Restaurantes(String franquicia, String restaurant, String ubicacion, String parqueo, String juegos, String gerente, String especialidad, String estado, String premium, int emp, int mesas, int cajeros) {
        this.franquicia = franquicia;
        this.restaurant = restaurant;
        this.ubicacion = ubicacion;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.gerente = gerente;
        this.especialidad = especialidad;
        this.estado = estado;
        this.premium = premium;
        this.emp = emp;
        this.mesas = mesas;
        this.cajeros = cajeros;
    }
    private int emp,mesas,cajeros;
    
    public Restaurantes(){
    }

    public Restaurantes(String franquicia, String restaurant, String ubicacion, String parqueo, String juegos, String estado, int emp, int cajeros) {
        this.franquicia = franquicia;
        this.restaurant = restaurant;
        this.ubicacion = ubicacion;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.estado = estado;
        this.emp = emp;
        this.cajeros = cajeros;
    }
    
    public Restaurantes(String franquicia, String restaurant, String ubicacion, String parqueo, String juegos, String estado, int emp, int cajeros, String premium) {
        this.franquicia = franquicia;
        this.restaurant = restaurant;
        this.ubicacion = ubicacion;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.estado = estado;
        this.emp = emp;
        this.cajeros = cajeros;
        this.premium=premium;
    }

    public Restaurantes(String franquicia, String restaurant, String ubicacion, String parqueo, String juegos, String gerente, String especialidad, String estado, int emp, int mesas, int cajeros) {
        this.franquicia = franquicia;
        this.restaurant = restaurant;
        this.ubicacion = ubicacion;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.gerente = gerente;
        this.especialidad = especialidad;
        this.estado = estado;
        this.emp = emp;
        this.mesas = mesas;
        this.cajeros = cajeros;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        this.parqueo = parqueo;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getCajeros() {
        return cajeros;
    }

    public void setCajeros(int cajeros) {
        this.cajeros = cajeros;
    }

    @Override
    public String toString() {
        
        return "" 
                + "\nFranquicia= " + franquicia 
                + "\nNombre del restaurante= " + restaurant 
                + "\nubicacion= " + ubicacion 
                + "\nparqueo= " + parqueo 
                + "\nArea de juegos= " + juegos 
                + "\ngerente= " + gerente 
                + "\nespecialidad= " + especialidad 
                + "\nestado= " + estado 
                + "\nNumero de empleados= " + emp 
                + "\nNumero de mesas= " + mesas 
                + "\ncajeros= " + cajeros
                + "\nPremium= " + premium;
    }
    
    
    
    
    
}
