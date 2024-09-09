package com.pellegrinoprincipe.software; 
 
public class Software 
{ 
    private Graphic graphic; 

    public enum Graphic { PHOTOSHOP, PAINT_NET } 

    public void setGraphic(Graphic g) { graphic = g; } 
    
    public Graphic getGraphic() { return graphic; } 
}