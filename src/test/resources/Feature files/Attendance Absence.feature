#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Attendance Absence feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Attendance main top-tab

  @HMPBerwyn_BER54_BER478_Planned_Absence_Add
  Scenario: Be able to add Planned Absence in system
    Given User is on Attendance page
    When I Click on Add Absence Side Tab
    And It navigates to Add Absence page
    Then I fill Add Absence form
    And Verify the newly added record in Absence form

  @HMPBerwyn_BER55_Planned_Absence_Edit
  Scenario: Be able to edit Planned Absence in system
    Given User is on Attendance page
    When I Click to edit on record "1" under Absence table
    And It navigates to edit Absence page
    Then I fill Edit Absence form
    And Verify the newly edited record in Absence form

  @HMPBerwyn_BER56_Planned_Absence_View
  Scenario: Be able to view Planned Absence in system
    Given User is on Attendance page
    When I Click to view on record "1" under Absence table
    And It navigates to view Absence page
    Then I verify the view Absence page

  @HMPBerwyn_BER57_Planned_Absence_Archieve
  Scenario: Be able to archieve Planned Absence in system
    Given User is on Attendance page
    When I Click to archieve on record "1" under Absence table
    Then the record "1" under Absence table gets archieved

  @HMPBerwyn_BER160_Planned_Absence_List
  Scenario: Be able to view Planned Absence list in system
    Given User is on Attendance page
    Then verify the entire Absence table contents

  @HMPBerwyn_BER258_BER484_Planned_Absence_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Attendance page
    Then I take a screenshot

  @HMPBerwyn_BER241_Attendance_RBAC
  Scenario: To check that we are able to add/edit records
    Given User is on Attendance page
    When I Click on Add Absence Side Tab
    Then It navigates to Add Absence page and return to home page of attendance
    And I Click to edit on record "1" under Absence table and return to home page of attendance
