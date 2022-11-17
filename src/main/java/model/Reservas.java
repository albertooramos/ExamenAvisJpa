package model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Reservas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Basic
    @Column(name = "fecha_fin")
    private Date fechaFin;
    @Basic
    @Column(name = "precio_total")
    private double precioTotal;
    @Basic
    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Users users;
    @OneToMany(mappedBy = "reservas", cascade = CascadeType.REMOVE)  //-----> cascade es para eliminar los extras al eliminar la reserva
    private Collection<ReservasExtras> reservasExtras;
    @ManyToOne
    @JoinColumn(name = "coche_id", referencedColumnName = "id", nullable = false)
    private Coches coches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Collection<ReservasExtras> getReservasExtras() {
        return reservasExtras;
    }

    public void setReservasExtras(Collection<ReservasExtras> reservasExtras) {
        this.reservasExtras = reservasExtras;
    }

    public Coches getCoches() {
        return coches;
    }

    public void setCoches(Coches coches) {
        this.coches = coches;
    }
}
