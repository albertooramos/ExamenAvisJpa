package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Coches {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "tipo")
    private String tipo;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "puertas")
    private int puertas;
    @Basic
    @Column(name = "asientos")
    private int asientos;
    @Basic
    @Column(name = "tipo_conduccion")
    @Enumerated(EnumType.STRING)
    private TipoConduccion tipoConduccion;
    @Basic
    @Column(name = "precio_dia")
    private double precioDia;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @OneToMany(mappedBy = "coches")
    private Collection<Reservas> reservasById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public Object getTipoConduccion() {
        return tipoConduccion;
    }

    public void setTipoConduccion(TipoConduccion tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coches coches = (Coches) o;
        return id == coches.id && puertas == coches.puertas && asientos == coches.asientos && Double.compare(coches.precioDia, precioDia) == 0 && Objects.equals(tipo, coches.tipo) && Objects.equals(descripcion, coches.descripcion) && Objects.equals(tipoConduccion, coches.tipoConduccion) && Objects.equals(updatedAt, coches.updatedAt) && Objects.equals(createdAt, coches.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, descripcion, puertas, asientos, tipoConduccion, precioDia, updatedAt, createdAt);
    }

    public Collection<Reservas> getReservasById() {
        return reservasById;
    }

    public void setReservasById(Collection<Reservas> reservasById) {
        this.reservasById = reservasById;
    }
}
