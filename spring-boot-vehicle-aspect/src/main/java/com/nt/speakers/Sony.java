package com.nt.speakers;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {
	 
    public String makeSound(Song song){ 

        return "Playing the song "+ song.getTitle()+ " by " 

                + song.getSinger()+ 

                " with Sony speakers"; 

    } 


}
