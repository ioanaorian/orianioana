package ro.utcluj.aut.isp.devices;

public class TV extends ElectronicDevice{
    int channel;

    public TV() {
    }

    void channelUp(){
        if(channel<=10){
            channel++;
            System.out.println("Channel up "+channel);
        }
    }

    void channelDown(){
        if(channel>=2){
            channel--;
            System.out.println("Channel down "+channel);
        }
    }

    public int getChannel() {
        return channel;
    }
}