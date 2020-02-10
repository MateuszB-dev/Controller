import javax.swing.*;

public class Buttons {

    private int channel = 1;
    private int volume = 1;
    private boolean onOff;
    private String[] buttons = {"On/Off ", "Kanał1 ", "Kanał2 ", "Kanał3 ", "Kanał4 ", "Kanał5 ", "Kanał6 ",
            "Kanał7 ", "Kanał8 ", "Kanał9 ", "ChannelUp ", "ChannelDown ", "VolumeUp ", "VolumeDown "};


    public void setVolumeDown() {
        if(volume>0)
        volume--;
        if(volume==0)
            System.out.println("TV został wyciszony.");
    }

    public void setVolumeUp() {
        if(volume<15)
            volume++;
        if (volume==15)
            System.out.println("MAX");
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int setChannel) {
            this.channel = setChannel;
    }

    public void setChannelUp() {
        channel++;
    }

    public void setChannelDown() {
        channel--;
    }

    public int getChannel() {
        return channel;
    }

    public boolean setOnOff(boolean onOff) {
        this.onOff = onOff;
        return onOff;
    }

    public void isOnOff() {
        if (onOff)
            System.out.println("włączony.");
        else
            System.out.println("wyłączony.");
    }

    public void showButtons() {
        for (int i = 0; i < buttons.length; i++) {
            System.out.print(buttons[i]);
        }
    }
    public void button(String buttons){
        System.out.println(buttons);

    }


}
