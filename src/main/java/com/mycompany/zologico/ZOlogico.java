

package com.mycompany.zologico;

import Zoo.inicio;

/**
 *
 * @author migue
 */
public class ZOlogico {

    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
}
