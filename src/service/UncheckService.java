/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.swing.JCheckBox;

/**
 *
 * @author Marius.Herta
 */
public class UncheckService {

    public static void uncheckCheckboxes(List<JCheckBox> checkboxes) {
        checkboxes.forEach(checkbox -> checkbox.setSelected(false));
    }
}
