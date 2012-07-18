Feature: As a Cloudbees user I want to know platform system variables
so that I can configure and deploy my sonar

Scenario: User lands on home page and can verify if sys variable exists

Given I access "home" page
And I enter "JAVA_HOME" in "systemVariable" filed
And click "Verify" button
Then I can see some path in result text