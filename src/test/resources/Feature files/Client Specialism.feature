#Author: subhajit.ghosh@meganexus.com
@Client_Specialism
Feature: To test Client Specialism feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER34_Specialism_Add
  Scenario: Be able to add Specialism in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click on Add Specialism button
    And I fill the add Specialism form
    And verify the Client Specialism form after adding

  @HMPBerwyn_BER35_Specialism_Edit
  Scenario: Be able to edit Specialism in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click edit button on row "1" of Specialism table and fill it
    And verify the Client Specialism form after editing

  @HMPBerwyn_BER36_Specialism_View
  Scenario: Be able to view Specialism in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then I click view button on row "1" of Specialism table
    And verify the Client Specialism form

  @HMPBerwyn_BER98_Specialism_List
  Scenario: Be able to verify Specialism list in system
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then verify the entire Specialism table contents

  @HMPBerwyn_BER251_Specialism_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Berwyn client profile page
    When I Click on Qualification sub-tab
    And It navigates to Qualification page
    Then click on JMESA and filters and test it for client Specialism
