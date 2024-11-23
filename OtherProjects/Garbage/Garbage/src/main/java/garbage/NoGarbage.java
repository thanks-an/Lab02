/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage;

/**
 *
 * @author ASUS
 */
public class NoGarbage {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Garbage collected for NoGarbage object");
        } finally {
            super.finalize();
        }
    }
}
