package ese3;

public class Light {

    private boolean lightOn = false;

    Light() {}

    public boolean onOff(boolean toggle) {
	if (toggle) {
	    if (lightOn)
		lightOn = false;
	    else
		lightOn = true;
	    return true; // luce cambiata
	} else {
	    return false; // luce non cambiata
	}
    }

    public boolean isLightOn() {
	return lightOn;
    }
}
