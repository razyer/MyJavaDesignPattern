package ObserverPattern;

/**
 * 观察者模式
 * @author tanzhen
 * @date 2018/8/2
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Dashboard1 dashboard1 = new Dashboard1(weatherData);
        Dashboard2 dashboard2 = new Dashboard2(weatherData);
        weatherData.updateWeather(10, 10, 10);
        weatherData.updateWeather(20, 10, 10);
        weatherData.removeListener(dashboard2);
        System.out.println("------------");
        weatherData.updateWeather(20, 10, 10);
        System.out.println("------------");
        weatherData.registerListener(dashboard2);
        weatherData.updateWeather(20, 10, 10);
    }

}
