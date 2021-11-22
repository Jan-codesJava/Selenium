package MyLearnings;

public class XPath {

   /*
    XPath is defined as XML path.
    It is a syntax or language for finding any element on the web page using XML path expression.
    XPath is used to find the location of any element on a webpage using HTML DOM structure.
    XPath can be used to navigate through elements and attributes in DOM(document object model).

    Example: /html/body/div[1]/div/div[3]/div[1]/img
    */

    /*
    DOM is an API interface provided by browser.
    When a web page is loaded, the browser creates a Document Object Model of the page
     */

   /* Types of XPath
   ------------------
   1) Absolute XPath / Full XPath
   /html/body/div[1]/div/div[3]/div[1]/img
   2) Relative XPath /Partial XPath
   //*[@id="divLogo"]/img

   Differences between Absolute & Relative XPaths
   -----------------------------------------------
   1) Absolute xpath starts from root node
   Relative xpath directly jump to element on DOM
   2) Absolute xpath start WITH /
   Relative xpath starts WITH //
   3) Absolute xpath we use only tags/nodes
   In Relative xpath we use attributes
    */
   /*
   Syntax of Relative XPath
   ------------------------
   Syntax:   //tagName[@attribute='value']
   Example: //input[@name="txtUsername"]
            *input[@name="txtUsername"]
       */
   /*
    How to capture XPath?
    -------------------
    1) Right click on element --> Inspect --> Highlight html --> Right click --> Copy XPAth
    2) Chropath extension
    3) SelectorHub

    Which XPath is preferred? Why?
    ANS: We use Relative because there is a problem in Absolute XPath when you are moving an element,
    or adding new element, there's a chances to break the xpath. So there is such technical issue behind that.

     XPath options
     --------------
     or
     and
     contains
     starts-with()
     text()
     chained xpath


    */



}
