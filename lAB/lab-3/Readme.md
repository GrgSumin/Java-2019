# Due date 13 december 2022
# Lab 3

## Applet
 * An applet is a Java program that runs in a Web browser. It  can be a fully functional Java application because it has the entire Java API at its disposal.
 
* It works at client side so less response time.
* It is Secured
* It can be executed by browsers running under many plateforms like ChromeLinux, Windows, Mac Os etc.
***

## Life cycle of applet

* Four methods in the Applet class gives you the framework on which you build any serious applet −

    * init − This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.

    * start − This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.

    * stop − This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.

    * destroy − This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.

    * paint − Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.
    ***

## GUI (Graphical User Interface)
 * It is made up of graphical components (e.g., buttons, labels, windows) through which the user can interact with the page or application.
    ## AWT (Abstract Window Toolkit)
    * AWT is an API that contains large number of classes and methods to create and manage GUI applications.
    * AWT was designed to provide a common set of tools for GUI design that could work on a variety of platforms.
    
    ## Swing
    * Swing in Java is a Graphical User Interface (GUI) toolkit that includes the GUI components. Swing provides a rich set of widgets and packages to make sophisticated GUI components for Java applications. 
    * It is used to create window-based applications
    * It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
    ***


 
