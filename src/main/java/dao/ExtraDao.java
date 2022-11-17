package dao;

import model.Extras;
import model.Reservas;

import java.util.Date;

public class ExtraDao extends Dao<Extras> {
    public Extras getExtras(Integer id) {
        return em.find(Extras.class, id);
    }
}
