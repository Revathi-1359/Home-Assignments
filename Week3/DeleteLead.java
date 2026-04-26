package com.testleaf.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']/parent::span")).click();
        driver.findElement(By.xpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input)[13]")).sendKeys("987654");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='x-btn-text']/parent::em")).click();
        driver.findElement(By.xpath("//div[@class='x-window-header x-unselectable x-window-draggable']/div")).click();
        driver.findElement(By.xpath("//button[text()='Find Leads']/parent::em")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11547");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.close();

    }




}








































































