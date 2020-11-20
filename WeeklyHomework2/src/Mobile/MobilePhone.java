package Mobile;

public class MobilePhone {
    private String modelName;
    private String imeiCode;
    private String versionCode;
    private int memoryCapacity;
    private double screenSize;
    private String keyboardType;


    public MobilePhone(){

    }

    public MobilePhone(String modelName,String imeiCode,String versionCode,int memoryCapacity,double screenSize) {
        this.modelName = modelName;
        this.imeiCode = imeiCode;
        this.versionCode = versionCode;
        if (memoryCapacity > 0 && screenSize > 0){
            this.memoryCapacity = memoryCapacity;
            this.screenSize = screenSize;
        }
        else {
            System.out.println("Incorrect login, of memory capacity or screen size");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void getDeviceInfo(){
        System.out.printf("Model name: %s\n" +
                "Imei Code: %s\n" +
                "Screen size: %.2f INC\n" +
                "Memory capacity: %d MB\n" +
                "Versiyon Code: %s\n",getModelName(),getImeiCode(),getScreenSize(),getMemoryCapacity(),getVersionCode());
    }



}
