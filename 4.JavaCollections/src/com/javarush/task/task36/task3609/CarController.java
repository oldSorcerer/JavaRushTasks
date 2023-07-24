package com.javarush.task.task36.task3609;

public class CarController {
    private final CarModel model;
    private final SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }

    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }

    public void increaseSpeed(int seconds) {
        if (getCarSpeed() < getCarMaxSpeed()) {
            setCarSpeed(getCarSpeed() + (int) (3.5 * seconds));
        }
        if (getCarSpeed() > getCarMaxSpeed()) {
            setCarSpeed(getCarMaxSpeed());
        }
    }

    public void decreaseSpeed(int seconds) {
        if (getCarSpeed() > 0) {
            setCarSpeed(getCarSpeed() - (12 * seconds));
        }
        if (getCarSpeed() < 0) {
            setCarSpeed(0);
        }
    }
}