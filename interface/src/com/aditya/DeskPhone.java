package com.aditya;

public class DeskPhone implements telephone{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(String phoneNumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone() {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
