package idao;

import model.Reservas;

public interface iReservaDao {
    Reservas aniadirReserva(Reservas r);

    boolean cambiarCocheReserva(Integer reservaId, Integer cocheId);

    boolean eliminarReserva(Reservas reserva);
}
