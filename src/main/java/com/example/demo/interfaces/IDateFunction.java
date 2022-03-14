package com.example.demo.interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public interface IDateFunction {

    default LocalDate getLocalDate(String fecha){
        Date fecNac = new Date();
        try {
            fecNac = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }
        return fecNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
