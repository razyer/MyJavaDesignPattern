package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject
 * @author tanzhen
 * @date 2018/8/2
 */
public class WeatherData implements Subject {
    private List<Listener> listenerList = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void updateWeather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyListeners();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerListener(Listener listener) {
        if (null != listener)
            listenerList.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        if (null != listener) {
            int i = listenerList.indexOf(listener);
            if (i >= 0)
                listenerList.remove(i);
        }
    }

    @Override
    public void notifyListeners() {
        if (listenerList.size() > 0) {
            for (Listener l : listenerList) {
                l.update();
            }
        }
    }
}
