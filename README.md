# Testing Catalunya Medieval using Java and Spring

This tutorial uses JBehave 3.x and Selenium 2.0 to test [catalunyamedieval.es](http://catalunyamedieval.es).

<img src="http://www.catalunyamedieval.es/wp-content/themes/catalunyamedieval/images/logo/logoCM-red-mini.png" alt="Catalunya Medieval logo" align="right" />

[![Build Status](https://travis-ci.org/eballo/catalunya-medieval-test-suite.svg?branch=master)](https://travis-ci.org/eballo/catalunya-medieval-test-suite)

## Running the stories

This will run the build and (after a minute or so) Firefox will open and test the catalunyamedieval.es website:

    mvn install 

You should see Firefox (installed on your system) flicker as it tests catalunyamedieval.es

This will run a single story (one contained in a validate_domain.story.story file):

    mvn install -DstoryFilter=validate_domain

This will run a suite based on the meta filters in the three story files:

    mvn install -Dmeta.filter="+color red"

## Viewing the results

In a directory target/view, a page named 'reports.html' has been generated.  
If you open that in any brower you can see the stories that have run and their execution status.

There should be a row for each story.  The story reports are clickable to via links on the right-most column.