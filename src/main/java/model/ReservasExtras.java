package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reservas_extras", schema = "AD_avis", catalog = "")
public class ReservasExtras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "id", nullable = false)
    private Reservas reservas;
    @ManyToOne
    @JoinColumn(name = "extra_id", referencedColumnName = "id", nullable = false)
    private Extras extras;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Reservas getReservas() {
        return reservas;
    }

    public void setReservas(Reservas reservas) {
        this.reservas = reservas;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }
}
