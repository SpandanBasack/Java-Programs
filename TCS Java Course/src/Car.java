import java.awt.*;
public class Car {
    double mileage;
    String licensePlateNumber;
    Color paintColor;
    boolean areTailLightsWorking;
    public Car(double inputMileage, String inputLicensePlateNumber, Color inputPaintColor, boolean inputAreTailLightsWorking)
    {
        this.mileage = inputMileage;
        this.licensePlateNumber = inputLicensePlateNumber;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }
    public void changePaintColor(Color changedPaintColor)
    {
        this.paintColor = changedPaintColor;
    }
    public double speedUp(double currentSpeed)
    {
        currentSpeed += 100;
        return currentSpeed;
    }
}
