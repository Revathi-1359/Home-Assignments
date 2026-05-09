package com.testleaf.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.xpath("//span[text()='Click']/parent::button")).click();
         String title = driver.getTitle();
         System.out.println(title);
         driver.navigate().back();
         WebElement element = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
         boolean enabled = element.isEnabled();
         if(enabled){
            System.out.println("The button is enabled");
         }
            else
                {
                System.out.println("The button is disabled");
            }
         WebElement element2 = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
         Point location = element2.getLocation();
         System.err.println("Submit"+location);
         //String rbgcolour = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("backgorund-colour");
        // System.out.println("The button color is:"+rbgcolour);
        String bgColor = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background-color");
        System.out.println("The button color is: " + bgColor);
        WebElement element3 = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
         Dimension size = element3.getSize();
         System.out.println("The height and width of this button is:"+size);
         



        }



}


