package userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static final Target INPUT_ClICK_SING_IN = Target.the("Input donde click en boton login").located(By.className("login"));
    public static final Target INPUT_EMAIL = Target.the("Input de email").located(By.id("email"));
    public static final Target INPUT_PASSWORD =Target.the("Input the password").located(By.id("passwd"));

}
