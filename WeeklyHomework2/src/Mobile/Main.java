package Mobile;

public class Main {
    public static void main(String[] args) {
        Samsung s1 = new Samsung("S1","TR87448725","AC872457",16000,4.7);
        Apple iphone = new Apple("Iphone 5","tr89458974","dhg6654325",32000,4.7);


        //No arg Samsung
        Samsung s2 = new Samsung();
        s2.setModelName("S2");
        s2.setScreenSize(5.7);
        s2.setImeiCode("xy7457654");
        s2.setMemoryCapacity(32000);
        s2.setVersionCode("ac984847");

        //No arg Apple
        Apple iphone2 = new Apple();
        iphone2.setModelName("Iphone 3G");
        iphone2.setImeiCode("aa8376356");
        iphone2.setScreenSize(4.0);
        iphone2.setVersionCode("ap857667");
        iphone2.setMemoryCapacity(32000);

        s1.sendSms();
        s1.call();
        s1.share();
        s1.listenMusic();

        iphone.sendSms();
        iphone.call();
        iphone.share();
        iphone.videoCall();

        s1.getDeviceInfo();
        s2.getDeviceInfo();
        iphone.getDeviceInfo();
        iphone2.getDeviceInfo();



    }
}
