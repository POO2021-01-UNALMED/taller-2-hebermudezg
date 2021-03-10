package test;

public class Auto {
	public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int cantidad = 0;
        for (Asiento asiento:asientos) {
            if (asiento != null){
            	cantidad++;}
        }
        return cantidad;
    }
    public String verificarIntegridad() {
    	String tatus = "Auto original";
        for (int i = 0; i < asientos.length; i++) {
            if ( (asientos[i]!=null) &&  (!(motor.registro == registro) || !(registro == asientos[i].registro))) {
                tatus = "Las piezas no son originales";
                break;
            }
        }
        return tatus;

    }

}
