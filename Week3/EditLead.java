package com.testleaf.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Leaftaps");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Revathi");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("VKrishnan");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Revss");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Analyst");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Leaftaps-Automation");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Revs31@gmail.com");
        WebElement stateprovince = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
        Select state = new Select(stateprovince);
        state.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This Automation Practice");
        driver.findElement(By.xpath("(//input[@name='submitButton']/parent::td)[1]")).click();
        driver.getTitle();
        driver.close();



        
        
    }



}












