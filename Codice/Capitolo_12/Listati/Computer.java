package com.pellegrinoprincipe.hardware;

public class Computer
{
    private String os;

    public enum Hardware { MOUSE, KEYBOARD }

    public void setOS(String os) { this.os = os; }
    public String getOS() { return os; }
}
