package de.tuhh.diss.audio.SS20;

import de.tuhh.diss.io.SimpleIO;

public class multiRoomPlayer {
	private static Speaker[] init( int num ) {
		Speaker[] speakers = new Speaker[num];
		for( int i = 0; i < num; i++ ) {
			speakers[i] = new Speaker();
			}
		return speakers;
		}
	
	private static void play( Speaker[] speakers, Stream stream, int volume ) {
		for( int i = 0; i < speakers.length; i++ ) {
			speakers[i].tuneVolume( volume );
			SimpleIO.print( "S" + i +": " );
			speakers[i].play( stream );
		}
	}
	
	public static void main( String[] args ) {
		//Stream stream = Stream( "Jump" ); [ORIGINAL]
		//Object/variable not declared properly (missing 'new')
		Stream stream = new Stream( "Jump" );
		Speaker[] apartment = init( 4 );
		play( apartment, stream, 100 );
		}
	//[ORIGINAL]
	//Brackets not closed for 'public class'
} //[ADDED]
	