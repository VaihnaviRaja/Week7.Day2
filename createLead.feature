Feature: CreateLead applications

Background: Positive Login
Given Enter the Username as 'DemoCSR2'
And Enter the Password as 'crmsfa'
When Click on the Login button
#Then Homepage should be displayed


Scenario Outline: Multiple data for CreateLead
Given Click CRMSFA link
And Click Leads button
And Click CreateLead button
When Enter the Company name as <cn>
And Enter the First name as <fn>
And Enter the Last name as <ln>
And Click on the CreateLead  button

Examples:
|cn|fn|ln|
|TestLeaf|Subraja|Subi|
|Qeagle|Arun|A|
