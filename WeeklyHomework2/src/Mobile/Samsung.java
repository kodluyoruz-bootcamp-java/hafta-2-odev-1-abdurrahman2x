package Mobile;


public class Samsung extends MobilePhone implements PhoneServices{
        private final String keyboardType = "Classic button Keybord";
        private final String markaName = "Samsung";

        Samsung(String modelName,String imeiCode,String versionCode,int memoryCapacity,double screenSize){
                super(modelName,imeiCode,versionCode,memoryCapacity,screenSize);
        }
        Samsung(){

        }

        public void listenMusic(){
            System.out.println("Starting music player...");
        }

    @Override
    public void share() {
        System.out.println("You started to share files");
    }

    @Override
        public void call() {
            System.out.println("Calling..");

        }

        @Override
        public void sendSms() {
            System.out.println("Your Message Has been sent");
        }

    @Override
    public void getDeviceInfo() {
        System.out.println("---------------------ABOUT YOUR SAMSUNG---------------------");
        System.out.println("Marka: "+markaName);
        super.getDeviceInfo();
        System.out.println("Keyboard Type: "+keyboardType);
    }
}
