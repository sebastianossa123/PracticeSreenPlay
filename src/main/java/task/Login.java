package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.INPUT_ClICK_SING_IN;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_ClICK_SING_IN)

        );
    }

    public static Login login(){
        return instrumented(Login.class);
    }
}
