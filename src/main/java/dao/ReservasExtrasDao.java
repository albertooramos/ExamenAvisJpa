package dao;

import idao.iReservasExtras;
import model.Estado;
import model.Extras;
import model.ReservasExtras;

import java.sql.Timestamp;
import java.util.List;

public class ReservasExtrasDao extends Dao<ReservasExtras> implements iReservasExtras {
    @Override
    public boolean aniadirExtrasReserva(Integer reservaId, List<Extras> extras) {
        try {
            ReservaDao reservaDao = new ReservaDao();
            ExtraDao extraDao = new ExtraDao();
            for (Extras extra: extras){
                ReservasExtras reservasExtras= new ReservasExtras();
                reservasExtras.setExtras(extraDao.getExtras(extra.getId()));
                reservasExtras.setReservas(reservaDao.getReservas(reservaId));
                this.create(reservasExtras);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
