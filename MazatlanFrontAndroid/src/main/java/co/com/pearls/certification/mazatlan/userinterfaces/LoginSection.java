package co.com.pearls.certification.mazatlan.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSection {
    public static final Target TXT_NAME = Target.the("cuadro de texto usuario").located(By.id("com.android.mazatlan:id/inputName"));
    public static final Target TXT_NICKNAME = Target.the("cuadro de texto usuario").located(By.id("com.android.mazatlan:id/inputNickName"));
    public static final Target TXT_NUMBERSHIRT = Target.the("cuadro de texto usuario").located(By.id("com.android.mazatlan:id/inputNumberShirt"));

    public static final Target CLIC_FANDATE = Target.the("cuadro de texto usuario").located(By.id("com.android.mazatlan:id/spinnerFanDate"));

    public static final Target SELECT_FANDATE = Target.the("cuadro de texto usuario").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
    public static final Target SELECT_IMAGE = Target.the("cuadro de texto usuario").located(By.id("com.android.mazatlan:id/shirtImageView"));

    public static final Target CLIC_BUTTON = Target.the("Clic continuar").located(By.id("com.android.mazatlan:id/continueButton"));

}
