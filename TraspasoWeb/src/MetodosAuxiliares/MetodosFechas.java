package MetodosAuxiliares;

import java.util.Calendar;

public class MetodosFechas {

    public static String pasarJCalendaraString(Calendar fechaIntroducida) {

        String fecha = null;

        //  METODOS PARA PASAR UN JCALENDAR A STRING
//        El siguiente comando pasa el objeto jCalendar a un String de formato "dd/MM/yyyy"
//        El siguiente comando pasa el objeto jCalendar a un String de formato "dd/MM/yyyy"
        fecha
                = String.valueOf(fechaIntroducida.get(fechaIntroducida.YEAR)) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.MONTH)+1) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.DAY_OF_MONTH));

        return fecha;
    }

}
