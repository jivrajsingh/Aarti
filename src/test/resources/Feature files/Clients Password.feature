#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Client Password feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with MIS Wales supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER240_Password_RBAC
  Scenario: Be able to view Password when logged as Welsh Supervisor in system
    Given User is on Berwyn client profile page
    When I Click on Password sub-tab
    And It navigates to Password view page
    Then I verify the view Password page

  @HMPBerwyn_BER47_Password_Change
  Scenario: Be able to view Password when logged as Welsh Supervisor in system
    Given User is on Berwyn client profile page
    When I Click on Password sub-tab
    And It navigates to Password view page
    Then we check that we can change password for the paticular client
