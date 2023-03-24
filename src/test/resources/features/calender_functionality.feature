Feature: Calender Functionality
  US: Verify Calendar Functionality


  Scenario: User should be able to land on weekly display
    Given user is already logged in page
    When user clicks the calendar button
    Then user should see weekly display


  Scenario: User can change calendar display to Day or Week or Month
    Given user is already logged in page
    When user clicks the calendar button
    And user can click Day button
    And user should see dayly display
    And user can click Week button
    And user should see weekly display
    And user can click Month button
    Then user should see monthly display


  Scenario: User can create event by clicking on time box
    Given user is already logged in page
    When user clicks calendar button
    And user clicks on time box
    Then user should see create window


  Scenario: User cannot create event without typing summary (empty summary)
    Given user is already logged in page
    When user clicks calendar button
    And user clicks on time box
    And user should see create window
    And user clicks create button without typing summary
    Then user should not create any event

  @wip
  Scenario: User can edit a created event
    Given user is already logged in page
    When user clicks the calendar button
    And user clicks aslanOnTimeSubject
    And user clicks aslanEditButton
    And user write s aslanMeetingSubject and click save button



  Scenario: user can change page display to Calendar / List
    Given user is already logged in page
    When user clicks the calendar button
    And user clicks List button
    And user should see list page
    And user clicks calendar2 button
    Then user should see calender page


  Scenario: user can find the created meeting in List by using search box.
    Given user is already logged in page
    When user clicks the calendar button
    And user clicks on time box3
    And user should see create window
    And user types "Sport Time Meeting" in the summary box
    And user click create button
    And user types "Sport Time Meeting" in search box on calender display and hit the enter
    Then user can find "Sport Time Meeting" in list


