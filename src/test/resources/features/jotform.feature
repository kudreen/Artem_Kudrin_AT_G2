Feature: CreatingForms

  Scenario: createClassicForm
    Given I start execution
    When I click to Login button
    Then I enter password
    Then I enter email
    Then I click 'Login' button again
    Then I wait
    Then I click 'Create form' button
    Then I click button with +
    Then I click 'Classic format' and wait
    Then I wait
    Then I click 'Publicate' button
    Then I wait
    Then I check creation

  Scenario: createCardForm
    Given I start execution
    When I click to Login button
    Then I enter password
    Then I enter email
    Then I click 'Login' button again
    Then I wait
    Then I click 'Create form' button
    Then I click button with +
    Then I click 'Card format' and wait
    Then I wait
    Then I click 'Publicate' button
    Then I wait
    Then I check creation