# catalunyamedieval.es using Java and Spring

This tutorial uses JBehave 3.x and Selenium 1.x to test [catalunyamedieval.es](http://catalunyamedieval.es).

<img src="http://jbehave.org/reference/preview/images/jbehave-logo.png" alt="JBehave logo" align="right" />

## Running the stories

This will run the build and (after a minute or so) Firefox will open and test the catalunyamedieval.es website:

    mvn install 

You should see Firefox (installed on your system) flicker as it tests Etsy.com

This will run a single story (one contained in a etsy_cart.story file):

    mvn install -DstoryFilter=validate_domain

This will run a suite based on the meta filters in the three story files:

    mvn install -Dmeta.filter="+color red"

## Viewing the results

In a directory target/view, a page named 'reports.html' has been generated.  
If you open that in any brower you can see the stories that have run and their execution status.

There should be a row for each story.  The story reports are clickable to via links on the right-most column.