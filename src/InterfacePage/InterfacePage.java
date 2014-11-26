package InterfacePage;
import java.util.ArrayList;

import commands.Commands;


public abstract class InterfacePage {
	public static long maxInterfacePageId;
	public long interfacePageId;
	
	public abstract Commands run();
	
	
}
