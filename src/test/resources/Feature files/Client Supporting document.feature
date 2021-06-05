#Author: subhajit.ghosh@meganexus.com
@Client_Supporting_document
Feature: To test Client Supporting document feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER37_Supporting_Document_Add
  Scenario: Be able to add Supporting Document in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click on Add Support document button to document
    And I fill the add Support document form

  @HMPBerwyn_BER39_Supporting_Document_View
  Scenario: Be able to view Supporting Document in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click view button on row "1" of Supporting Document table

  @HMPBerwyn_BER148_Supporting_Document_List
  Scenario: Be able to verify Supporting Document list in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then verify the entire Supporting Document table contents

  @HMPBerwyn_BER76_Supporting_Document_Delete
  Scenario: Be able to delete Supporting Document in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click delete button on row "1" of Supporting Document table
    And verify the Supporting Document form

  @HMPBerwyn_BER252_Supporting_Document_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I take a screenshot for Support Document
