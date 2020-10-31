/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mariomthree
 */
public class Helpers {

    public static Date convertStringToDateAndReturn(String dateString) {
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        try {
            Date dateParsed = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            calendar.setTime(dateParsed);
            date = calendar.getTime();
        } catch (ParseException ex) {
            //  Logger.getLogger(AddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

}
