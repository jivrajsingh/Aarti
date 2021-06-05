#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Attendance Check-In and Check-Out feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Attendance main top-tab

  @HMPBerwyn_BER61_Attendance_CheckIn_Add_CheckForm
  Scenario: Be able to add CheckIn in system
    Given User is on Attendance page
    When I Click on Add CheckIn Side Tab
    And It navigates to Add Absence page
    Then fill add CheckIn form
    And verify the newly added CheckIn entry in table

  @HMPBerwyn_BER591_Attendance_CheckIn_Archieve
  Scenario: Be able to archieve CheckIn in system
    Given User is on Attendance page
    When I filter record under CheckIn table
    Then I check Archieve functionality for CheckIn table

  @HMPBerwyn_BER59_Attendance_CheckIn_VerifyTable
  Scenario: Be able to verify Check In table in system
    Given User is on Attendance page
    When I filter record under CheckIn table
    Then I verify the entire CheckIn table contents

  @HMPBerwyn_BER593_Attendance_CheckIn_JMESASorting_Filtering
  Scenario: Be able to perform JMESA sorting and filtering of Check-In table in system
    Given User is on Attendance page
    When I filter record under CheckIn table
    Then I click JMESA of CheckIn table

  @HMPBerwyn_BER62_BER63_Attendance_CheckOut_Add_CheckForm
  Scenario: Be able to add CheckOut in system
    Given User is on Attendance page
    When I Click on Add CheckOut Side Tab
    And It navigates to Add Absence page
    Then First Verify Incentives dropwdown
    And fill add CheckOut form
    And verify the newly added CheckOut entry in table

  @HMPBerwyn_BER592_Attendance_CheckOut_Archieve
  Scenario: Be able to archieve CheckOut record in system
    Given User is on Attendance page
    When I filter record under CheckOut table
    Then I check Archieve functionality for CheckOut table

  @HMPBerwyn_BER60_Attendance_CheckOut_VerifyTable
  Scenario: Be able to verify Check Out table in system
    Given User is on Attendance page
    When I filter record under CheckIn table
    Then I verify the entire CheckIn table contents

  @HMPBerwyn_BER594_Attendance_CheckOut_JMESASorting_Filtering
  Scenario: Be able to perform JMESA sorting and filtering of Check-Out table in system
    Given User is on Attendance page
    When I filter record under CheckOut table
    Then I click JMESA of CheckOut table

  @HMPBerwyn_BER595_CheckIn_RBAC
  Scenario: To check that we are have RBAC for checkIn functionality
    Given User is on Attendance page
    When I Click on Add CheckIn Side Tab
    Then It navigates to Add CheckIn page and return to home page of attendance
    
    @HMPBerwyn_BER596_CheckOut_RBAC
  Scenario: To check that we are have RBAC for CheckOut functionality
    Given User is on Attendance page
    When I Click on Add CheckOut Side Tab
    Then It navigates to Add CheckOut page and return to home page of attendance
    
