package de.tuhh.diss.audio.SS20;

import de.tuhh.diss.io.SimpleIO;

public class Speaker {
	public static final int MAX = 100;
	private int volume;
	
	public Speaker() {
		this.volume = 0;
		}
	
	public void tuneVolume( int volume ) {
		// [ORIGINAL]
		/*
		if( volume <= 0 && volume >= MAX ) {
			this.volume = volume;
			}
		}
		*/
		//The volume could not be set with the above block
		if( volume >= 0 && volume <= MAX ) {
			this.volume = volume;
			}
		}
	
	public void play( Stream stream ) {
		SimpleIO.println( "Playing ’"+ stream.getTitle()+ "’ at volume: " + this.volume );
		}
	}
