/*
public class UIComponent
{
}
public class Button extends UIComponent
{
}
public class TextField extends UIComponent
{
}
public class CheckBox extends UIComponent
{
}
public abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.prinlnt("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}

create 3 child classes of "UIComponentCreator"
	WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator
 in all these classes "createUIComponent()" method must be defined in such a way that whatever type is passed as per this it must return 
 a specific UIComponent. e.g. if "button" is passed , it should return "Button" class object   or if "textfield" is passed , 
 it should return "TextField" class object.
create a class UIComponentCreatorDemo with main function
inside main function
	create objects of WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator classes and invoke "createUIComponent()" ,"add()" and "show()" methods.
 */
class UIComponent
{
}
class Button extends UIComponent
{
}
class TextField extends UIComponent
{
	
}
class CheckBox extends UIComponent
{
	
}
abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.println("Added the component\t"+component.getClass().getName());
	}
	public abstract UIComponent createUIComponent(String type);
}
class WindowsUIComponentCreator extends UIComponentCreator
	{
		public UIComponent createUIComponent(String type)
		{
			
			switch(type.toLowerCase()) 
			{
			case"button": return new Button();
			case"textfield":return new  TextField();
			case"checkbox":return new CheckBox();
			default : return null;
			}
		}
	}
class LinuxUIComponentCreator extends UIComponentCreator
	{
		public UIComponent createUIComponent(String type)
		{
			switch(type.toLowerCase()) 
			{
			case"button": return new Button();
			case"textfield":return new  TextField();
			case"checkbox":return new CheckBox();
			default : return null;
			}
		}
}
class MacUIComponentCreator extends UIComponentCreator
{
	public UIComponent createUIComponent(String type)
	{
		switch(type.toLowerCase()) 
		{
		case"button": return new Button();
		case"textfield":return new  TextField();
		case"checkbox":return new CheckBox();
		default : return null;
		}
	}
}


