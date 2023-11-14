package org.vm.example.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.model.buildinfo.BuildInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.vm.example.steps.HappyNewYearSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class HappyNewYearTest {
    @Steps
    private HappyNewYearSteps happyNewYearSteps;

    @BeforeAll
    public static void insertBuildInfo() {
        BuildInfo.section("Toggles").setProperty("toggle-custom-ads-v2", "on");
        BuildInfo.section("Toggles").setProperty("toggle-user-feedback", "on");

        BuildInfo.section("Versions").setProperty("game-history-service", "1.2.3");
        BuildInfo.section("Versions").setProperty("player-service", "3.4.5");
        BuildInfo.section("Versions").setProperty("related-products-service", "2.3.4");
    }

    @Test
    @DisplayName("The greeting text is as expected")
    public void someTest() {
        happyNewYearSteps.validateMovieName();
    }
}
