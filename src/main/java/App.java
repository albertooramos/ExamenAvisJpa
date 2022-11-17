import dao.*;
import model.Coches;
import model.Extras;
import model.Reservas;
import model.Users;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ReservaDao reservaDao=new ReservaDao();



        Reservas reserva = new Reservas();
        Coches coche =new CocheDao().getCoches(1);
        reserva.setCoches(coche);
        Users user = new UserDao().getUser(2);
        reserva.setUsers(user);

        /*    --1-- Reservas reservaAniadida =  reservaDao.aniadirReserva(reserva);

        System.out.println("-------------AÑADIR RESERVA -----------------");
        System.out.println(reservaAniadida!=null ? "reserva añadida" : "ERROR reserva añadida");*/

       /*---2---*/
       /*boolean cambiarCocheReserva = reservaDao.cambiarCocheReserva(1,6);

        System.out.println("-------------Cambiar coche reserva -----------------");
        System.out.println(cambiarCocheReserva ? "coche cambiado" : "ERROR coche cambiado");*/


        /*---3---*/

        /*Reservas reservaEliminar= reservaDao.getReservas(6);
        boolean eliminarReserva = reservaDao.eliminarReserva(reservaEliminar);

        System.out.println("-------------eliminar reserva -----------------");
        System.out.println(eliminarReserva ? "reserva eliminada" : "ERROR reserva eliminada");*/



        /*---5---*/

        ExtraDao extraDao=new ExtraDao();
        List<Extras> extras=new ArrayList<>();
        extras.add(extraDao.getExtras(1));
        extras.add(extraDao.getExtras(2));
        extras.add(extraDao.getExtras(3));
        boolean aniadirExtras = new ReservasExtrasDao().aniadirExtrasReserva(5,extras);

        System.out.println("-------------añadir extras -----------------");
        System.out.println(aniadirExtras ? "extra añadido" : "ERROR extra añadido");

    }
}
