package test;
public class Motor {
	public int numeroCilindros;
    public String tipo;
    public int registro;
    public void cambiarRegistro(int reg){
        this.registro = reg;
    }
    public void asignarTipo(String tipoN){
        switch (tipoN){
            case"electrico":
            case"gasolina": {
                this.tipo = tipoN;
                break;
            }
        }
    }
}
