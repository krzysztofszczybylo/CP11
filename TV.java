
public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume
{
    private String model;
    private String resolution;
    private boolean isOn;
    private int channelNo;
    private int volume;
    private String[] channelList;
    public TV(String model, String resolution, boolean isOn, int channelNo, int volume, String[] channelList){
        this.model = model;
        this.resolution = resolution;
        this.isOn = isOn;
        this.channelNo = channelNo;
        this.volume = volume;
        this.channelList = channelList;
    }
    public boolean on(){
        return this.isOn = true;
    }
    public boolean off(){
        return this.isOn = false;
    }
    public int channelUp(){
        channelNo = channelNo + 1;
        if (channelNo > 99){
            return 1;
        }
        else{return channelNo;}
    }
    public int channelDown(){
        channelNo = channelNo - 1;
        if (channelNo < 1){
            return 99;
        }
        else{return channelNo;}
    }
    public void setChannel(int channelNo){
        if (isOn == false){
            
        }
        else{
            if(isOn == true && channelNo > 0 && channelNo < 100){
                this.channelNo = channelNo;
            }
            else{
                System.out.println("This channel does not exist.");
            }
        }
    }
    public int volumeUp(){
        if(volume == 10){
            return volume = 10;
        }
        else{
            return volume = volume + 1;
        }
    }
    public int volumeDown(){
        if(volume == 1){
            return volume = 1;
        }
        else{
            return volume = volume - 1;
        }
    }
    public void display(){
        System.out.println("Model: " + model + "\nResolution: " + resolution);
        if (isOn == true && channelNo < 11){
            System.out.println("TV is on" + "\nChannel number: " + channelNo + "\nChannel name: " + channelList[channelNo - 1] + "\nVolume: " + volume);
        }
        else if(isOn == true){
            System.out.println("TV is on" + "\nChannel number: " + channelNo + "\nChannel name is not available." + "\nVolume: " + volume);
        }
        else{
            System.out.println("TV is off");
        }
        
    }
    public static void main(String[] args){
        String[] channelList = {"Channel 1", "Channel 2", "Channel 3", "Channel 4", "Channel 5", "Channel 6", "Channel 7", "Channel 8", "Channel 9", "Channel 10"};
        TV t1 = new TV("TV1", "resolution1", false, 1, 1, channelList);
        t1.on();
        t1.display();
        t1.setChannel(6);
        for(int i = 0; i < 6; i++){
            t1.volumeUp();
        }
        t1.display();
        t1.setChannel(15);
        t1.display();
        t1.off();
        t1.display();
    }
}
