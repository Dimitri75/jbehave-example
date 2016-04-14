Scenario: Browsing through websites with Selenium

Given the following website: http://www.uqac.ca/
When I click to .//*[@id='etudiants']/a
Then the page title should be Portail des étudiants - Université du Québec à Chicoutimi