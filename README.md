<h1>overview</h1><br/>

here i wrote a test script to test the process of addto cart from the amazon websitea <br/>
1)the login process: <br/>
by entering valid phonenumber and valid password(you have already signed up first ).<br/>
2)search for an item: <br/>
  by entering the item's name on the search bar and click(submit) .<br/>
3)choose the desired item:<br/>
  for example: my script choose the second option from the result page.<br/>
4)add to cart:<br/>
  then we add this item into the cart by click on the add to cart button after choose the quantity .<br/>
<h2>frameworks</h2><br/>
1)selenium<br/>
2)testNG<br/>
 note:you need to add the dependency of selenium java and testNG.<br/>
<h3>more details</h3><br/>
- the script read data using the annotation of data provider from TestNG.<br/>
- i applied the POM design pattern (It helps reduce code duplication and improves test case maintenance).<br/>
- there is a suite called testing.xml to run all the test cases from.<br/>

