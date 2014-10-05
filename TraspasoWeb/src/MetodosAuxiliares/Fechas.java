package MetodosAuxiliares;

import java.util.Calendar;

public class Fechas {

    public static String pasarJCalendaraString(Calendar fechaIntroducida) {

        String fecha = null;
        fecha
                = String.valueOf(fechaIntroducida.get(fechaIntroducida.YEAR)) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.MONTH)+1) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.DAY_OF_MONTH));

        return fecha;
    }

}
