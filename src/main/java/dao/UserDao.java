package dao;

import model.Coches;
import model.Users;

import java.util.Date;

public class UserDao extends Dao<Users> {
    public Users getUser(Integer id) {
        return em.find(Users.class, id);
    }
}
