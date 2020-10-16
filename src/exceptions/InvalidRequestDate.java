/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Marius.Herta
 */
public class InvalidRequestDate extends Exception{
    public InvalidRequestDate(String message) {
        super(message);
    } 
}
