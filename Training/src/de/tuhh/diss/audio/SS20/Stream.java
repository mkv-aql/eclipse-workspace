package de.tuhh.diss.audio.SS20;

public class Stream {
	//private char title; [ORIGINAL]
	// Since initialize 'Stream' takes in string to be put into 'this.title', then private variable must be in String type. 
	private String title;
	
	public Stream( String title ) {
		this.title = title;
		}
	
	public String getTitle() {
		return this.title;
		}
	}
