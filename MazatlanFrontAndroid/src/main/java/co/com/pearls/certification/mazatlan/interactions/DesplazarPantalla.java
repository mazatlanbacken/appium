package co.com.pearls.certification.mazatlan.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class DesplazarPantalla implements Interaction {
    int posicionInicialX;
    int posicionDestinoX;
    int posicionInicialY;
    int posicionDestinoY;

    public DesplazarPantalla(int posicionInicialX, int posicionDestinoX, int posicionInicialY, int posicionDestinoY){
        this.posicionInicialX = posicionInicialX;
        this.posicionDestinoX = posicionDestinoX;
        this.posicionInicialY = posicionInicialY;
        this.posicionDestinoY = posicionDestinoY;
    }
    @SuppressWarnings("rawtypes")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();


        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.press(PointOption.point(posicionInicialX, posicionInicialY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(posicionDestinoX, posicionDestinoY))
                .release()
                .perform();
    }

    public static DesplazarPantalla haciaArriba(){
        WebDriver driver = getProxiedDriver();
        Dimension dimension = driver.manage().window().getSize();

        int posicionInicialY = (int) (dimension.height / 2);
        int posicionDestinoY = (int) (dimension.height / 4);

        return instrumented(DesplazarPantalla.class, 0,0,posicionInicialY,posicionDestinoY);
    }
}
