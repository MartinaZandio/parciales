package ej1;

public class contacto{
    private String nombre;
    private String apellido;

    public contacto(String nombre, String apellido) throws excepcionNombre, excepcionApellido{
        if(nombre == null || nombre.equals("")){
            throw new excepcionNombre("El nombre no puede ser nulo o vacio");
        }else{
        this.nombre = nombre; }
        if(apellido == null || apellido.equals("")){
            throw new excepcionApellido("El apellido no puede ser nulo o vacio");
        }else{
        this.apellido = apellido;
         }
        
        }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }


    public String toString(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido;
    }

}