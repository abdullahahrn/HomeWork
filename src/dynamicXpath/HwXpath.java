package dynamicXpath;

public class HwXpath {
/*
 www.amazon.com
 1.tag with a single attribute.
     //input[@id='edit-submit--3']
     //input[@id='twotabsearchtextbox']
     //a[@class='nav-logo-link nav-progressive-attribute']
     //div[@class='layoutToolbarPadding']
     //button[@id='rcx-subscribe-submit-button-announce']
 
 www.bestbuy.com
 2. Tag with multiple attribute with 'or' logic
     //input[@id='gh-search-input' or @class='search-input']
     //button[@class='clear-search-icon hidden' or @class='Clear search text']
     //span[@class='store-display-name' or @data-cy='location-tooltip-lv-display-name']
     //a[@data-lid='hdr_carticon' or @href=https://www.bestbuy.com/cart']
     //a[@href='/site/misc/deal-of-the-day/pcmcat248000050016.c?id=pcmcat248000050016' or @data-lid='hdr_dotd']
 
     www.bestbuy.com
 * 3) Tag with multiple attribute with 'and' logic 
	 //button[@id='gnav20-search-icon' and @aria-label='Search Verizon']
	 //div[@class='gnav20-dropdown-menu gnav20-hide ' and @id='gnav20-sign-in']
	 //a[@href='https://www.verizon.com/stores' and @data-label='Stores']
	 //div[@data-desktop-image='https://ss7.vzw.com/is/image/VerizonWireless/vzw-iconic-5gphones-hero-img-d?scl=1' and @ data-background-image='https://ss7.vzw.com/is/image/VerizonWireless/vzw-iconic-5gphones-hero-img-d?scl=1']
	 //iframe[@sandbox='allow-scripts allow-same-origin' and @title='Adobe ID Syncing iFrame']
	
	 www.amazon.com
 * 4) Tag with inner text [means complete text]
	 //a[text()='Sell products on Amazon']
	 //a[text()='Books']
	 //a[text()='Back to School']
	 //a[text()='Hispanic Heritage Month on Prime Video']
	 //a[text()='Amazon Explore ']
  
  5) Tag with inner text [not complete inner text rather partial text as well as actual text] (most commonly used)
  	 //h2[contains(text(),' more phone plans?')]
	 //title[contains(text(),'Chargers vs. Chiefs')]
	 //a[contains(text(),'Sell products on Amazon')]
	 //a[contains(text(),'Reload Your Balance')]
	 //title[contains(text(),'Home Services - Amazon Customer Service')]
  
  6) Tag with attributes and use of contains (not commonly used)
     //div[contains(@class,'pre-l-wrapper mauto-sm d-sm-flx')]
	 //script[contains(@id,'gen-nav-shared')]
	 //script[contains(@type,'text/javascript')][5]
	 //style[contains(@class,'server-style-loader-element')]
	 //script[contains(@id,'esi-optimizely-src-skipped')]

  7) Normalize space -- eliminates leading and trailing spaces. (high level) – learn slowly
  //script[normalize-space(text())='window.PAGE_VERSION = "42c30a228";']
 
  
  8) Starts with text
    //span[starts-with(text(),'Banking')]
    //p[starts-with(text(),'Start Of Main Content')]
    //span[starts-with(text(),'Investments')]
	//title[starts-with(text(),'State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®')]
	//span[starts-with(text(),'Pay a Bill')]
 
  9) Starts with attribute (not commonly used, no need to practice it)
	 //h2[starts-with(@class,'u-fontDisplay u-te')]
	 //ul[starts-with(@class,'list-none flex flex-row m-none p-none')]
	 //a[starts-with(@data-t,'header-primary-logo')]
	 //nav[starts-with(@class,'hamburger-menu')]
	 //a[starts-with(@data-lid,'hdr_carticon')]
 
 */	
}
