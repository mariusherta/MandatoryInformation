/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.InvalidRequestDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Marius.Herta
 */
public class SwithOffCalculatorService {

    public static String getSwitchOffDate(LocalDate requestDate, String billDate) throws InvalidRequestDate {
        validateRequestDate(requestDate);
        LocalDate nextBillDatePlusOne = getNextBillDatePlusOne(requestDate, billDate);
        if (requestDate.plusDays(20L).isAfter(nextBillDatePlusOne)) {
            return convertDateToString(nextBillDatePlusOne.plusMonths(1L));
        }
        return convertDateToString(nextBillDatePlusOne);
    }

    private static String convertDateToString(LocalDate switchOffDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        return formatter.format(switchOffDate);
    }

    private static LocalDate getNextBillDatePlusOne(LocalDate requestDate, String billDate) {
        LocalDate currentDay = LocalDate.now();
        Integer bDplusOne = getBDPlusOne(billDate);
        if (currentDay.getDayOfMonth() > bDplusOne) {
            return currentDay.plusMonths(1).withDayOfMonth(bDplusOne);
        }
        return currentDay.withDayOfMonth(bDplusOne);
    }

    private static Integer getBDPlusOne(String billDate) {
        if (billDate.equals("28")) {
            return 1;
        }
        return Integer.parseInt(billDate) + 1;
    }

    private static void validateRequestDate(LocalDate requestDate) throws InvalidRequestDate {
        if (requestDate == null) {
            throw new InvalidRequestDate("Trebuie sa completezi data solicitarii.");
        }

        if (requestDate.isAfter(LocalDate.now())) {
            throw new InvalidRequestDate("Data solicitarii nu poate fi in viitor.");
        }
    }
}
