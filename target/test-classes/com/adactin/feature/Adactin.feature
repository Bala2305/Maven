Feature: Hotel Booking In Adactin Application


@tag1
Scenario Outline: Login Functionality

Given user Launch The Application

When enter The "<id>" In Username Field

And enter The "<password>" In Password Field

Then user Click On The Login Button And It Navigate To Hotel Search

Examples:
|id|password|
|abc|123|
|qwerty|7890|
|Bala2305|Sanjay@05|