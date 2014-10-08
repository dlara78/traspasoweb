package MetodosAuxiliares;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

    public static String pasarJCalendaraString(Calendar fechaIntroducida) {

        String fecha = null;
        fecha
                = String.valueOf(fechaIntroducida.get(fechaIntroducida.YEAR)) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.MONTH) + 1) + "-"
                + String.valueOf(fechaIntroducida.get(fechaIntroducida.DAY_OF_MONTH));

        return fecha;
    }

    public static Date pasarFecha_a_Date(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public static String date_a_StringBonito(Date fechaInicial) {
        String convertido = "";

        try {
            DateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
            convertido = fecha.format(fechaInicial);
        } catch (Exception e) {
            convertido = "- abierto -";
        }
        return convertido;
    }

}
