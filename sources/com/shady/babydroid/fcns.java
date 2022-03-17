package com.shady.babydroid;

public class fcns {
    public String chanbong(String inp) {
        String out = "";
        for (int i = 0; i < inp.length(); i++) {
            out = out + ((char) (inp.charAt(i) ^ 15));
        }
        return out;
    }

    public String heisen(String inp) {
        String out = "";
        for (int i = 0; i < inp.length(); i++) {
            out = out + ((char) (inp.charAt(i) ^ 14));
        }
        return out;
    }
}
