package model;

public class Light {

  protected boolean isOn;

  public boolean isOn() {
    return isOn;
  }

  public boolean isShining() {
    if (isOn) {
      return true;
    } else {
      return false;
    }
  }

  public void switchOff() {
    isOn = false;
  }

  public void switchOn() {
    isOn = true;
  }

}
