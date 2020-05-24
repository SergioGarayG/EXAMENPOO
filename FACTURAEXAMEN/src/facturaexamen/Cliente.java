
package facturaexamen;

public class Cliente extends Persona{
    private Boolean CreditoActivo;

    public Boolean getCreditoActivo() {
        return CreditoActivo;
    }

    public void setCreditoActivo(Boolean CreditoActivo) {
        this.CreditoActivo = CreditoActivo;
    }
}
