package com.stolaine.spring.model;

import org.springframework.stereotype.Component;

@Component("vandeMatram")
public class VandeMatram implements CompactDisc {
    private String title = "Vande Matram";
    private String artist = "A. R. Rehmaan, Late Lata Mangeshkar";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
