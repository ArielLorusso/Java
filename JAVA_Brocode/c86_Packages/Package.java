import Tools.ToolBox;                           // import Class from Package
//import Tools.*;                               // import Whole Package

public class Package
{    
    public static void main(String[] args) {
        ToolBox toolBox = new ToolBox();        //  instance class from package 
        toolBox.shout();                        //  using object method
    }
}
/*
Package = folder
Contains files with names	ClassName.java  solurcecode:
	package <FolderName>;
	public class <ClassName> {}

import Tools.ToolBox;
 */