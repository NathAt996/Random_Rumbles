public class TV {

    public int channel = 1;
    public int volumeLevel = 5;
    public boolean on = false;


    public TV() {

    }


    public void turnOn() {

        on = true;
        System.out.println("TV is ON.");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF.");
    }

    public void setChannel(int newChannel) {

        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }

        else if (!on) {
            System.out.println("Cannot change channel, TV is off.");
        }

        else {
            System.out.println("Invalid channel number. Must be between 1 and 120.");
        }
    }

    public void setVolume(int newVolumeLevel) {

        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 10) {
            volumeLevel = newVolumeLevel;
        }

        else if (!on) {
            System.out.println("Cannot change volume, TV is off.");
        }

        else {
            System.out.println("Invalid volume level. Must be between 1 and 10.");
        }
    }
}