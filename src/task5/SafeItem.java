package task5;

public class SafeItem {
    public int value;
    public int volume;

    public SafeItem(int volume, int value) {
        this.value = value;
        this.volume = volume;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
