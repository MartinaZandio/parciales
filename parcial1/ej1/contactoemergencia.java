package ej1;

public class contactoemergencia extends contacto{
    private String relacion; 

    public contactoemergencia(String nombre, String apellido, String relacion) throws excepcionNombre, excepcionApellido, excepcionRelacion{
        super(nombre, apellido);
        if(relacion == null || relacion.equals("")){
            throw new excepcionRelacion("La relacion no puede ser nula o vacia");
        }else{
        this.relacion = relacion;
        }
    }

    public static String alerta(){
        
    }
}