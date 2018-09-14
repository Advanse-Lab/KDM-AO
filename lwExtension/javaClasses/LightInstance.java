package lightweight;


import kdm.code.*;
import kdm.kdm.*;



public class LightInstance {

	private static final Datatype IntegerType = null;
	private static final Datatype StringType = null;
	private static final Datatype BooleanType = null;

	public static void main(String[] args) {
		
		//**********[Begin Source code base]**********
		
		InterfaceUnit myInterfacePersistenceRoot = CodeFactory.eINSTANCE.createInterfaceUnit();
		myInterfacePersistenceRoot.setName("PersistenceRoot");
		
		ClassUnit myClassClient = CodeFactory.eINSTANCE.createClassUnit();
		myClassClient.setName("Client");
		
		//**********[End Source code base]**********
		
		
		
		

	}

}
