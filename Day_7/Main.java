
public class Main {

	//public static 
	public static void main(String[] args) {
		UIComponentCreator ref[]=new UIComponentCreator[3];
		ref [0]=new WindowsUIComponentCreator();
		ref[1]=new LinuxUIComponentCreator();
		ref [2]=new MacUIComponentCreator();
		for(int i=0;i<ref.length;i++) 
		{
			ref[i].show("Button");
			ref[i].show("TextField");
			ref[i].show("CheckBox");
		}

;
		
	}

}
