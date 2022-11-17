package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Extras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "titulo")
    private String titulo;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "precio")
    private double precio;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @OneToMany(mappedBy = "extras")
    private Collection<ReservasExtras> reservasExtrasById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        Extras extras = (Extras) o;
        return id == extras.id && Double.compare(extras.precio, precio) == 0 && Objects.equals(titulo, extras.titulo) && Objects.equals(descripcion, extras.descripcion) && Objects.equals(updatedAt, extras.updatedAt) && Objects.equals(createdAt, extras.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descripcion, precio, updatedAt, createdAt);
    }

    public Collection<ReservasExtras> getReservasExtrasById() {
        return reservasExtrasById;
    }

    public void setReservasExtrasById(Collection<ReservasExtras> reservasExtrasById) {
        this.reservasExtrasById = reservasExtrasById;
    }
}
