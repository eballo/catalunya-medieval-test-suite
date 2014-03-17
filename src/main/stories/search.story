Narrative: 

In order to test that the search is working
As a user
I want to open search for a castle

Scenario: Search for a Orrit
Given the advanced search page
Then search with text Orrit
When submit the form
Then show the results page with 2 results

Scenario: Search for a castell de santa agueda
Given the advanced search page
Then search with text Agueda
When submit the form
Then show the results page with 1 results

Scenario: Search for a castell de montjuic
Given the advanced search page
Then search with text Montjuic
Then search with comarca Barcelonès
When submit the form
Then show the results page with 1 results