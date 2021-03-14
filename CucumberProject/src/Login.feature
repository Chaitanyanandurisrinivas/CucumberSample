Feature: Login 

	In order to get quotes from Compare the Market 
As a User
I want to enter Correct details to get accurate quote

Scenario: In Order to get accurate quotes 
	Given Navigate to Compare the Market URL 
	When Click on Life Insurance 
	And Click Just myself and Next button 
	And select Title as "Mr"
	And Enter "Test First Name" as First Name "Test Surname" as Surname and Click on Next 
	And Select "12" from Date of Birth Day Dropdown "May" from Date of Birth Month Dropdown "1997" from Date of Birth Year Dropdown and Click on Next 
	And Select "No" under In the past 12 months have you used any tobacco products question and Click on Next 
	And Select "Level Term" under type of cover question and Click on Next 
	And Enter "5" under How many years would you like your cover to last question and Click on Next 
	And Enter "20000" under minimum amount of cover question and Click on Next 
	And Select "No/Decide Later" under Critical Illness Cover question and Click on Next 
	And Enter "test@test.com" under email address "01234567890" under phone number and Click on Next 
	And Enter "SK11 6UZ" under post code question and click Find Address Button, Wait for Some time 
	And Select Address from dropdown and Click on Next 
	And Select "Do not Contact" from Can we stay in touch question and Click on Next and and Click on Next and Confirm 
	And click on Get your quotes button and wait for some time 
	Then Verify that List of Quotes are displayed