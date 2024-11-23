/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package garbage;

/**
 *
 * @author ASUS
 */
public class Garbage {

    public static void main(String[] args) {
        GarbageCreator.createGarbage();
        NoGarbage.finalize();
    }
}
