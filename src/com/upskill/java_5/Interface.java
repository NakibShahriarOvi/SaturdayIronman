package com.upskill.java_5;

public interface Interface {

	// Interface will only have Abstract Method.
	
    public abstract void iDoors();
	
	public abstract String iEngine();
	
    public abstract String iColor();
	
	public abstract int iWheels();

	
	
}
 
/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)
						
Class						extends					 Class		 
Abstract Class (+2)  		extends					 Class (-2=0)
Interface (+2)			  implements				 Class (-2=0)
Interface (+2)				 extends				Interface (+2+2=+4)    implements				Class(-4=0)
Interface				  implements				Abstract
Abstract					extends					interface				implements				Class
*/