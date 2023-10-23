package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Insignia", 20);
        System.out.println(tv);

        // mute it
        tv.mute();
        System.out.println(tv);

        //unmute and see if volume restored
        tv.mute();
        System.out.println(tv);

        // mute again and check if muted - set volume and see if it unmutes

        tv.mute();
        System.out.println(tv);
        tv.setVolume(50);
        System.out.println(tv);
    }

}