package MetodosAuxiliares;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
