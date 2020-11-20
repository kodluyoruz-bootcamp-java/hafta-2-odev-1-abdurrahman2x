package Mobile;




public class Apple extends MobilePhone implements PhoneServices{
    private final String markaName = "Apple";
    private TouchKeyboard keyboard = new TouchKeyboard();

    Apple(String modelName,String imeiCode,String versionCode,int memoryCapacity,double screenSize){
        super(modelName,imeiCode,versionCode,memoryCapacity,screenSize);
    }
    Apple(){

    }
    public void videoCall(){
        System.out.println("Facetime video calling..........");
    }


    @Override
    public void share() {
        System.out.println("You started to share a screen");
    }

    @Override
    public void call() {

        System.out.println("Calling....");

        }

        @Override
    public void sendSms() {
        System.out.println("Yor message has been sent..");
    }

    @Override
    public void getDeviceInfo() {
        System.out.println("---------------------ABOUT YOUR IPHONE---------------------");
        System.out.println("Marka: "+markaName);
        super.getDeviceInfo();
        System.out.println("Keyboard type: "+keyboard.getKeyboardType());
    }
}
