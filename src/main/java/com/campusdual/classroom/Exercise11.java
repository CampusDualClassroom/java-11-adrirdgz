package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV
        redRemote.turnOn();
        if (redRemote.on) {
            System.out.println("El mando está: encendido");
        } else {
            System.out.println("El mando está: apagado");
        }

        // Subir el canal
        redRemote.channelUp();
        System.out.println("El canal es: " + redRemote.getChannel());

        // Bajar el canal
        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.getChannel());

        // Establecer el canal en 0, intentar bajar y comprobar que no se puede
        redRemote.channel = 0;
        System.out.println("El canal es: " + redRemote.getChannel());
        redRemote.channelDown(); // Canal ya en 0
        redRemote.channelDown(); // Debería mostrar que no se puede bajar más

        // Subir el volumen
        redRemote.volumeUp();
        System.out.println("El volumen es: " + redRemote.getVolume());

        // Bajar el volumen
        redRemote.volumeDown();
        System.out.println("El volumen es: " + redRemote.getVolume());


        // Establecer el volumen en 0, intentar bajar y comprobar que no se puede
        redRemote.volume = 0;
        System.out.println("El volumen es: " + redRemote.getVolume());
        redRemote.volumeDown();



        // Apagar la TV
        redRemote.turnOff();
        if (redRemote.on) {
            System.out.println("El mando está: encendido");
        } else {
            System.out.println("El mando está: apagado");
        }

    }

}