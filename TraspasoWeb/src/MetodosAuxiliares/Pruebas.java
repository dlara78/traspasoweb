package MetodosAuxiliares;

import java.util.Calendar;

public class Pruebas {

    public static void main(String args[]) {
        Calendar ahoraCal = Calendar.getInstance();
        System.out.println(ahoraCal.getClass());
        ahoraCal.set(2004, 1, 7);
        System.out.println(ahoraCal.getTime());
        ahoraCal.set(2004, 1, 7, 7, 0, 0);
        System.out.println(ahoraCal.getTime());
    }

}
