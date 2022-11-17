package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "rol")
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @OneToMany(mappedBy = "users")
    private Collection<Reservas> reservasById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
        Users users = (Users) o;
        return id == users.id && Objects.equals(name, users.name) && Objects.equals(email, users.email) && Objects.equals(password, users.password) && Objects.equals(rol, users.rol) && Objects.equals(updatedAt, users.updatedAt) && Objects.equals(createdAt, users.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, rol, updatedAt, createdAt);
    }

    public Collection<Reservas> getReservasById() {
        return reservasById;
    }

    public void setReservasById(Collection<Reservas> reservasById) {
        this.reservasById = reservasById;
    }
}
