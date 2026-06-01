package com.omrbranch.runner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestRunnerClass {
	private void T0101_omr() {
    	//Open omrbranch
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);		
	}	
    private void T0102_traniningInOmr() {
    	//Open traininginomr
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.traininginomr.co.in");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);				
	}
    private void T0103_greensTech() {
    	//Open greenstech
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in.");
		String title3 = driver.getTitle();
		System.out.println(title3);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
	}
    
    private void T0101_omr2() {
    	//Open omrbranch
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);		
	}	
    private void T0102_traniningInOmr2() {
    	//Open traininginomr
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.traininginomr.co.in");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);				
	}
    private void T0103_greensTech2() {
    	//Open greenstech
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in.");
		String title3 = driver.getTitle();
		System.out.println(title3);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
	}

    public static void main(String[] args) {
		TestRunnerClass task1 = new TestRunnerClass();
		task1.T0101_omr();
		task1.T0102_traniningInOmr();
		task1.T0103_greensTech();
		task1.T0101_omr();
		task1.T0102_traniningInOmr();
		task1.T0103_greensTech();
}
}