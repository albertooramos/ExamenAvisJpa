package dao;


import idao.iReservaDao;
import model.Coches;
import model.Estado;
import model.Reservas;

import java.sql.Timestamp;

public class ReservaDao extends Dao<Reservas> implements iReservaDao {


    @Override
    public Reservas aniadirReserva(Reservas r) {
        try {
            r.setEstado(Estado.valueOf("pendiente"));
            r.setPrecioTotal(0);
            r.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            r.setCreatedAt(new Timestamp(System.currentTimeMillis()));
             return this.create(r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean cambiarCocheReserva(Integer reservaId, Integer cocheId) {
        try {
            Reservas reservas=getReservas(reservaId);
            Coches coche= new CocheDao().getCoches(cocheId);
            reservas.setCoches(coche);
            this.update(reservas);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Reservas getReservas(Integer id) {
        return em.find(Reservas.class, id);
    }

    @Override
    public boolean eliminarReserva(Reservas reserva) {
        try {
            this.delete(reserva);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
