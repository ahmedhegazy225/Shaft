package com.qacart.shaft;

import com.fasterxml.jackson.databind.BeanProperty;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class openbrowsers {
    @Test
    public void actions() throws InterruptedException {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/actions.html");
        By firstNameInput = By.name("firstName");
        By lastNameInput = By.name("lastName");
        By leveDropDown = By.name("level");
        By webRadio = By.id("web");
        By submit = By.id("actions-button");
       driver.element().type(firstNameInput, "Hatem");
        driver.element().type(lastNameInput, "Hatemalah");
        driver.element().select(leveDropDown,"Junior");
        driver.element().click(webRadio);
        driver.element().click(submit);
        Thread.sleep(5000);
        driver.quit();

    }
  @Test
  public void waits(){
      SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
      driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/wait.html");

      By primary = By.className("primary");
      By cover = By.className("cover");
      By secondary = By.className("secondary");


      driver.element().click(primary);
      driver.element().click(secondary);
      driver.quit();



  }

}
