package Mobile;

public class ClassicKeyboard implements OEM{
    private final String keyboardType = "Classic Keyboard";
    @Override
    public String getKeyboardType() {
        return keyboardType;
    }
}
