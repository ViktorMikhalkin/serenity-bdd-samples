package org.vm.example.steps;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class HappyNewYearSteps extends ScenarioSteps {
    @Step
    public void validateMovieName() {
        assertThat("The greeting 'Happy New Year!'").isNotNull()
                .startsWith("The")
                .contains("Happy")
                .endsWith("Year!'");
    }
}
