#Author: subhajit.ghosh@meganexus.com
@ActivityArea
Feature: To test Activity area feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then User is on landing page
    And I Click on Activity Area top tab
    And I click on Activity Area view button and view a record for Required Specialism purpose only

  @HMPBerwyn_BER85_Activity_Area_Client_Resourse_Allocation_List
  Scenario: Be able to view list Client Resourse Allocation in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then After creating a Required Specialism record is already available so verify it
    And Take Screenshot of Client Allocation Table

  @HMPBerwyn_BER590_Activity_Area_Client_Resourse_Allocation_JMESASorting
  Scenario: Be able to sort JMESA and filter results for Client Resourse Allocation
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I select values to filter results for Client Allocation Table
    And I click on JMESA to sort results for Client Allocation Table
