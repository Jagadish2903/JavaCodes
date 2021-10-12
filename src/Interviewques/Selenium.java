package Interviewques;

public class Selenium {

	public static void main(String[] args) {
		 //1.What is the difference bet isSelected/isDisplayed/isEnabled?
		//Ans.
			//isDisplayed---It is used to check whether the element is displayed or not and the return type of it is boolean
			//isEnabled ---It is used to check whether the box is enabled or not (eg.search or submit button) and return type is boolean
			//isSelected --It is used to check whether the element is selected or not (Eg.Checkbox) and return type is boolean
		
		//2.Types of locators
		//Ans. 
		//1.By Id(Always be unique)
		//2.By Name(can be duplicate sometimes
		//3.By Class Name(it is a CSS property no of class name will be calculated based on spaces (i.e form-Horizontal is a 1 class name and form horizontal is a 2 class name)
				//if there is eg. 3 matches it will pass the value to the first value always
		//4.By Xpath(It is not the attribute its like a address of the web element)
		//5.By Css Selector(It is not the attribute,CSS is CASTCADED STYLE SHEET,Its something like design)
		//6.By linkText(All the links will be in a tag (anchor tag) href --Hyperlink reference
		//7.By partialLinkText
		//8.By tagName
				
		

	}

}
