Feature: Create Incident

Scenario: Create Incident in ServiceNow
Given Enter the username as 'admin'
Given Enter the password as 'm3GkKEKU8atr'
When Click on Login Button
Given Click Incident
Given Click New Button
Given Get Incident Number 
Given Enter mandatory details and submit
Given Enter the captured incident number
Given Click the incident
Given Select Resolved
Given Update WorkNotes
Given Click Resolve
Given Click the incident
Then Verify resolution