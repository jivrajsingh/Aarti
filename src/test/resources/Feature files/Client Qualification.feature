#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Client Qualification feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER31_BER456_BER457_Qualification_Add
  Scenario: Be able to add Qualification in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click on Add Qualification button
    And I fill the add Qualification form

  @HMPBerwyn_BER32_Qualification_Edit
  Scenario: Be able to edit Qualification in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click edit button on row "1" of Qualification table and fill it
    And verify the Qualification form

  @HMPBerwyn_BER33_Qualification_View
  Scenario: Be able to view Qualification in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click view button on row "1" of Qualification table
    And verify the Qualification form

  @HMPBerwyn_BER97_Qualification_List
  Scenario: Be able to verify list of Qualification in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then verify the entire Qualification table contents

  @HMPBerwyn_BER250_Qualification_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I take a screenshot

  @HMPBerwyn_BER231_Client_Qualification_RBAC
  Scenario: To check that we are able to add/edit Client Qualification
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click on Add Qualification button and return to home page of qualification
    And I click edit button on row "1" of Qualification table and return to home page of qualification
