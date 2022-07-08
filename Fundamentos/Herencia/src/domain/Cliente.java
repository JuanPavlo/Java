
package domain;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, Date fechaRegistro, boolean vip) {
        super(nombre);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente { ");
        sb.append("Nombre = ").append(this.nombre);
        sb.append(", Id Cliente = ").append(this.idCliente);
        sb.append(", Fecha Registro = ").append(this.fechaRegistro);
        sb.append(", Vip =").append(this.vip);
        sb.append('}');
        return sb.toString();
    }
    
}
