Feature: LeafTaps applications

Background: Positive Login
Given Enter the Username as 'DemoCSR2'
And Enter the Password as 'crmsfa'
When Click on the Login button
Given Click CRMSFA link
And Click Leads button

Scenario Outline: Multiple data for EditLead

Given Click FindLead button
And Click Phone button
And Enter phonenumber as '99'
And Click Find Leads button
Then Click the first result
And Click Edit button
And Enter the company name as 'TCS'
Then Click Submit button



			
			