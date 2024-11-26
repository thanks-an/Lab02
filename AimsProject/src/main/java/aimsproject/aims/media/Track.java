/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aimsproject.aims.media;

import aimsproject.aims.Playable;

/**
 *
 * @author ASUS
 */
public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override public void play() { System.out.println("Playing Track: " + this.title); System.out.println("Track length: " + this.length); }
}
