package dao;

import model.Coches;

import java.util.Date;

public class CocheDao extends Dao<Coches>{
    public Coches getCoches(Integer id) {
        return em.find(Coches.class, id);
    }
}
