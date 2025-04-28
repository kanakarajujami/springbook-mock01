package com.nt.speakers;

import org.springframework.stereotype.Component;

@Component 
public class Bose implements Speaker{ 

public String makeSound(Song song){ 

        return "Playing the song "+ song.getTitle()+ " by " 

                + song.getSinger()+ 

                " with Bose speakers"; 

    } 
}