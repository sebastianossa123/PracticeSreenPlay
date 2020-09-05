package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_ClICK_SING_IN),
                Enter.theValue("sebastianossa159@gmail.com").into(INPUT_EMAIL),
                Enter.theValue("animal123").into(INPUT_PASSWORD)
        );
    }

    public static Login login(){
        return instrumented(Login.class);
    }
}
