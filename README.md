
# Meridian Tattoo Supply - Spring Boot Application
## WESTERN GOVERNOR UNIVERSITY
## D287 – JAVA FRAMEWORKS
### About This Project:
This supply website is designed to be a website for a supply store with both products and individual parts to the
products. My collaboration to this project enabled the website to be fully functional with CRUD functionality and logic implementation to validate entries and functions.
My personal collaboration can be seen below in the walk-through describing what changes were made and where in the project they can be found.

## Step C.
### Prompt:
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
### Changes Made:
File: mainscreen.html -- Lines: 10-13

Change: Commented out bootstrap link so that I can customize the html page using css.

File: mainscreen.html -- Lines: 14-16

Change: Linked 3 fonts to be used when styling the html file.

File: mainscreen.html -- Lines: 17-128

Change: Created an internal css to style the html page.

File: mainscreen.html -- Lines: 18-20

Change: Added a background color within the body tag.

File: mainscreen.html -- Lines: 21-28

Change: Styled the header so that I can create a small navigational bar.

File: mainscreen.html -- Lines: 29-36

Change: Styled h1 tag to adjust size, color, and family of the font. 

File: mainscreen.html -- Lines: 37-44

Change: Styled h2 tags to adjust size, color, and family of the font.

File: mainscreen.html -- Lines: 45-102

Change: Styled the two search boxes, including placing them side by side, changing the font, and styling the buttons and background color.

File: mainscreen.html -- Lines: 103-126

Change: Styled the navigation bar to align with the header. 

File: mainscreen.html -- Line: 129

Change: Changed the title tag to "Meridian Tattoo Supply".

File: mainscreen.html -- Line: 135

Change: Changed the shop name in the h1 tag to "Meridian Tattoo Supply"

File: mainscreen.html -- Lines: 134-142

Change: Wrapped lines 134-142 in a div element for easier access when styling.

File: mainscreen.html -- Lines: 136-141

Change: Created a list inside a nav tag to create the html for the navigation bar.

File: mainscreen.html -- Lines: 144-233

Change: Wrapped lines 144-233 in a section element for easier access when styling.

File: mainscreen.html -- Lines: 145-187

Change: Wrapped lines 145-187 in a div element for easier access when styling.

File: mainscreen.html -- Lines: 188-232

Change: Wrapped lines 188-232 in a div element for easier access when styling.

File: mainscreen.html -- Lines: 146 & 189

Change: Changed h2 tags to "Machine Parts" and "Tattoo Products" to reflect the theme of the customer store.

File: mainscreen.html -- Lines: 147-153

Change: Created list of items to include in each search box.

File: mainscreen.html -- Lines: 190-196

Change: Created list of items to include in each search box.


## Step D.
### Prompt:

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

### Changes Made:
File: about.html -- Line: 2

Change: added thymeleaf to the html tag.

File: about.html -- Line: 6

Change: added a meta tag in the header element.

File: about.html -- Line: 9-11

Change: Added links to fonts that are used in css.

File: about.html -- Line: 14

Change: Changed title tag to "About Page".

File: about.html -- Lines: 17-100

Change: Added css styling to the html file.

File: about.html -- Lines: 19-63

Change: Added styling for header and navigation bar.

File: about.html -- Lines: 67-99

Change: Added the styles for the about information.

File: about.html -- Lines: 105-113

Change: Created the navigation bar with "Home" and "About".

File: about.html -- Lines: 117-132

Change: Created a box to hold the About information. 

File: about.html -- Line: 131

Change: Created a button that is linked to the Home page. 

File: mainscreen.html -- Lines: 236-245

Change: Created a button that is linked to the about page.

File: AboutController.java -- Lines: 9-12

Change: Created the AboutController class and added the annotation "@GetMapping" and a string that connects to the about.html file.

File: AboutController.java -- Line: 6

Change: Added @Controller annotation.

File: mainscreen.html -- Lines: 138-139

Change: Changed links in the navigation bar to links to the mainscreen html file and about html file.

## Step E.
### Prompt
E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
### Changes:
File: mainscreen.html -- Line: 189

Change: Changed h2 tag for the Products search box to "Machine Products" so that it aligns with the parts.

File: mainscreen.html -- Lines 190-195

Change: Changed the list of products to better align with the parts listed. 

File: BootStrapData.java -- Line 47

Change: Created a list that holds every element in the outsourcedPartsRepository

File: BootStrapData.java -- Line 48

Change: Created a set to store every part in the list.

File: BootStrapData.java -- Lines 50-53

Change: Wrote a for loop that goes through the OutSourcedParts list and adds the name to the Set existingParts.

File: BootStrapData.java -- Line: 54

Change: Wrote an if statement to check that both repositories were empty before adding parts.

File: BootStrapData.java -- Lines: 55-92

Change: Created 5 new parts for the sample inventory with the company name, name, inventory, price, and ID.

File: BootStrapData.java -- Lines: 95-103

Change: Commented out code that created the same list "OutsourcedPart" because i did not need it twice.

File: BootStrapData.java -- Line 105

Change: Created a new list that holds the parts I created so that I can loop through them next.

File: BootStrapData.java -- Lines: 107

Change: Created a for loop to loop through the outsourcedPartsToAdd list that i just created. 

File: BootStrapData.java -- Lines: 108

Change: Wrote an if statement to check to see if the name in the loop exists in existingParts.

File: BootStrapData.java -- Lines: 109

Change: If the name did exist, a new part called "multipack" will be created. 

File: BootStrapData.java -- Lines: 116-117

Change: Save the multipack part to the repository and print out the name and company name.

File: BootStrapData.java -- Lines: 118-120

Change: Wrote an else statement that will save the individual part to the repository instead and print the name and company name. 

File: BootStrapData.java -- Lines: 126-130

Change: Created new sample inventory for the products.

File: BootStrapData.java -- Lines: 132-136

Change: Saved each new product to the product repository.



## Step F.

### Prompt:

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

### Changes Made:

File: mainscreen.html -- Lines: 53-63

Changes: Changed the width, margin, and padding in the search boxes to allow for more space for future buttons.

File: mainscreen.html -- Lines: 92-93

Changes: Changed the width of the buttons to fit the content within them, and changed the border to none.

File: mainscreen.html -- Lines: 230-233

Changes: Created a form using thymeleaf to create a functional "buy now" button.

File: success.html --  Line: 2

Changes: Added the thymeleaf link to use in the HTML file.

File: success.html -- Lines: 6-8

Changes: Added links to fonts to use in the HTML file.

File: success.html -- Lines: 10-13

Changes: Added styles to set the background color.

File: success.html -- Lines: 15-20

Changes: Added styles to the success box class to change the placement of the content. 

File: success.html -- Lines: 23-26

Changes: Added styles to the h1 tag to set the color and font.

File: success.html -- Lines: 28-29

Changes: Added styles to the link that takes the user back to the home page.

File: success.html Lines: 44

Changes: Changed the title to "Success".

File: success.html -- Lines: 49-54

Changes: Wrap a div around the message and button to style the content together.

File: success.html -- Lines: 51

Change: Created a message that tells the user they successfully purchased the item. 

File: success.html -- Lines: 53

Changes: Created a link that takes the user back to the home page. 

File: failure.html -- Line: 2

Changes: Added thymeleaf link to use it in the html file.

File: failure.html -- Lines: 6-8

Changes: Added in links to fonts that are used in the html file.

File: failure.html -- Lines: 10-13

Changes: Added in the styles for the body tag to change the color of the background.

File: failure.html -- Lines: 15-21

Changes: Added the styles for the content of the page and centered it. 

File: failure.html -- Lines 23-33

Changes: Added styles to the h1 and h2 tags to change its fonts and colors.

File: failure.html -- Lines: 35-47

Changes: Added styles to the link and changed its color, font, and placement. 

File: failure.html -- Lines: 52

Changes: Changed the title to "Failure".

File: failure.html -- Lines: 57-63

Changes: Wrapped the content in a div for easier access when styling. 

File: failure.html -- Lines: 59-60

Change: Created a h1 and h2 tag to display a message for the user.

File: failure.html -- Lines: 62

Change: Added in a link to the Home page. 

File: buyNowController.java -- Lines: 1-11

Changes: Created a new java class and imported in the other classes to be used in this file. 

File: buyNowController.java -- Lines: 13

Change: Added in the Controller annotation.

File: buyNowController.java -- Lines: 16

Change: Added in the Autowire annotation.

File: buyNowController.java -- Lines: 17

Change: Initialized the private ProductRepository variable.

File: buyNowController.java -- Lines: 19

Change: Added in the Post Mapping annotation.

File: buyNowController.java -- Lines: 20-36

Changes: Created a new method that accepts the productID as a parameter and holds the logic that checks if the product is not null, and decrements the inventory if it is not null.

File: buyNowController.java -- Lines: 37

Changes: Added GetMapping annotation.

File: buyNowController.java -- Lines: 38-40

Change: created a method that returns the html file success.

File: buyNowController.java -- Lines: 42

Change: Added in a GetMapping annotation.

File: buyNowController.java -- Lines: 43-45

Change: created a method that returns the html file failure.

## Step G.

### Prompt:
G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

### Changes:

File: Part.java -- Lines: 32-33

Changes: Initialized minInv.

File: Part.java -- Lines: 35-36

Changes: Initialized maxInv.

File: Part.java -- Lines: 46-49

Changes: Created a constructor with minInv and maxInv as parameters.

File: Part.java -- Lines: 112-122

Changes: Created getters and setters for the new variables maxInv and minInv.

File: BootStrapData.java -- Lines: 61-62

Changes: Set minInv and maxInv for the first sample inventory item.

File: BootStrapData.java -- Lines: 71-72

Changes: Set minInv and maxInv for the second sample inventory item.

File: BootStrapData.java -- Lines: 81-82

Changes: Set minInv and maxInv for the third sample inventory item.

File: BootStrapData.java -- Lines: 91-92

Changes: Set minInv and maxInv for the fourth sample inventory item.

File: BootStrapData.java -- Lines: 101-102

Changes: Set minInv and maxInv for the fifth sample inventory item.

File: InhousePartForm.html -- Lines: 26-30

Changes: Created two text fields, one for minInv and the other for maxInv.

File: OutsourcedPartForm.html -- Lines: 25-29

Change: Created two text fields, one for minInv and the other for maxInv.

File: mainscreen.html -- Lines: 59-60

Change: Changed padding on the search boxes to create more room for the newly added columns. 

File: mainscreen.html -- Lines: 174-175

Change: Added Minimum Inventory and Maximum Inventory Table Headers. 

File: mainscreen.html -- Lines: 184-185

Change: Added in two <td> tags for minInv and maxInv.

In user folder: changed database name to spring-boot-rename.

File: application.properties -- Line: 6

Change: updated database name to spring-boot-rename. 

File: Part.java -- Lines: 141-143

Change: Created a method that checks if the inventory is within minInv and maxInv.

File: AddOutsourcedPartController.java -- Lines: 42-46

Change: added an if statement that returns a message if part.validRangeLimit() is false.

File: AddInhousePartController.java -- Lines: 42-45

Changes: added an if statement that returns a message if part.validRangeLimit() is false.

## Step H.

### Prompt:
H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

### Changes:

File: Part.java -- Lines: 145-147

Changes: Added validation by creating a method to check if the inventory is less than the minimum inventory. 

File: Part.java -- Lines: 149-151

Changes: Added validation by creating a method to check if the inventory is greater than the maximum inventory. 

File: AddOutsourcedPartController.java -- Lines: 43 - 57

Change: Used if statements and bindingResult to create error messages if the lessThanMin() or the greaterThanMax() methods return true.

File: AddInhousePartController.java -- Lines: 43 - 57

Change: Used if statements and bindingResult to create error messages if the lessThanMin() or the greaterThanMax() methods return true.

File: ValidEnufParts.java

Change: Updated the default message to be more specific to the error occurring. 

File: EnufPartsValidator -- Lines: 37

Change: Added additional validation to the existing logic using an if statement to check if the inventory when reduced by one falls below the minimum inventory. 

## Step I.

### Prompt:
I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

### Changes: 

File: PartTest.java -- Lines: 105-123

Changes: Created two unit tests for the minimum field called getMinInv() and setMinInv().

File: PartTest.java -- Lines: 125-144

Changes: Created two unit tests for the maximum field called getMaxInv() and setMaxInv().

## Step J.

### Prompt
J.  Remove the class files for any unused validators in order to clean your code.

File: DeletePartValidator.java

Changes: Deleted this class as it had no usages. 