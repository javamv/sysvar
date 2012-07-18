Feature: As a Cloudbees user I want to know platform system variables
so that I can configure and deploy my sonar

Scenario: User lands on home page and can verify if sys variable exists

Given I access "home" page
When I enter "JAVA_HOME" in "systemVariable" filed
And click "Verify" button
Then I can see "C:\dev\jdks\jdk1.6.0_27" in result text