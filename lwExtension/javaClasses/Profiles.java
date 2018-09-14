package lightweight;

import kdm.code.CodePackage;
import kdm.kdm.ExtensionFamily;
import kdm.kdm.KdmFactory;
import kdm.kdm.Segment;
import kdm.kdm.Stereotype;
import kdm.kdm.TagDefinition;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class Profiles {


	public static Stereotype aspectUnit;
	public static TagDefinition isPrivileged;
	public static TagDefinition perType;
	public static TagDefinition perPointCut;
	public static TagDefinition declaredParents;
	public static TagDefinition declaredImplements;
	public static TagDefinition preceeds;
	public static TagDefinition precededBy;
	public static Stereotype staticCrossCuttingFeature;
	public static TagDefinition onType;
	public static Stereotype crossCuttingConcern;
	public static Stereotype pointCutUnit;
	public static Stereotype compositePointCutUnit;
	public static TagDefinition composee;
	public static TagDefinition composite;
	public static TagDefinition compositionType;
	public static Stereotype operationPointCutUnit;
	public static TagDefinition operation;
	public static Stereotype withinCodePointCutUnit;
	public static Stereotype executionPointCutUnit;
	public static Stereotype callPointCutUnit;
	public static Stereotype preInitializationPointCutUnit;
	public static Stereotype adviceExecutionPointCutUnit;
	public static Stereotype propertyPointCutUnit;
	public static Stereotype getPointCutUnit;
	public static Stereotype setPointCutUnit;
	public static Stereotype adviceUnit;
	public static TagDefinition pointCut; 
	public static TagDefinition adviceExecutionType;
	public static Stereotype PointCutPointCutUnit;
	public static Stereotype cFlowPointCutUnit;
	public static Stereotype cFlowBelowPointCutUnit;
	public static Stereotype typePointCutUnit;
	public static TagDefinition type;
	public static Stereotype withinPointCutUnit;
	public static Stereotype exceptionPointCutUnit;
	public static Stereotype staticInitializationPointCutUnit;
	public static Stereotype thisPointCutUnit;
	public static Stereotype argsPointCutUnit;
	public static Stereotype targetPointCutUnit;
	public static Stereotype contextExposingPointCutUnit;
	public static TagDefinition argsNames;
	
	
	
	public static ExtensionFamily createLightProfile () {
	//public static Stereotype createLightProfile () {
		
		// Create a resource set to hold the resources.
				//
				ResourceSet resourceSet = new ResourceSetImpl();

				// Register the appropriate resource factory to handle all file extensions.
				//
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				(Resource.Factory.Registry.DEFAULT_EXTENSION, 
						new XMIResourceFactoryImpl());

				// Register the package to ensure it is available during loading.
				//
				resourceSet.getPackageRegistry().put
				(CodePackage.eNS_URI, 
						CodePackage.eINSTANCE);
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.code"));


				Segment segment = KdmFactory.eINSTANCE.createSegment();

				segment.setName("mySegment");


				//*****************[Begin Extension Family]**********************
				ExtensionFamily lightweightExFamily = KdmFactory.eINSTANCE.createExtensionFamily();
				
				//****[Begin AspectUnit]****
				Stereotype aspectUnit = KdmFactory.eINSTANCE.createStereotype();
				aspectUnit.setName("AspectUnit");
				aspectUnit.setType("ClasUnit");
				lightweightExFamily.getStereotype().add(aspectUnit);//Add the stereotype into the extension family
				
				//Creation of the Tag IsPrivileged 
				isPrivileged = KdmFactory.eINSTANCE.createTagDefinition();
				isPrivileged.setTag("isPrivileged");
				isPrivileged.setType("boolean");
				aspectUnit.getTag().add(isPrivileged); //Association of the tag into the stereotype 

				//Creation of the TagDefinition perType 
				perType = KdmFactory.eINSTANCE.createTagDefinition();
				perType.setTag("perType");
				perType.setType("AspectInstantiationType");
				aspectUnit.getTag().add(perType); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition perPointCut 
				perPointCut = KdmFactory.eINSTANCE.createTagDefinition();
				perPointCut.setTag("perPointCut");
				perPointCut.setType("PointCut");
				aspectUnit.getTag().add(perPointCut); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition declaredParents
				declaredParents = KdmFactory.eINSTANCE.createTagDefinition();
				declaredParents.setTag("declaredParents");
				declaredParents.setType("Generalization");
				aspectUnit.getTag().add(declaredParents); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition declaredImplements
				declaredImplements = KdmFactory.eINSTANCE.createTagDefinition();
				declaredImplements.setTag("declaredImplements");
				declaredImplements.setType("InterfaceRealization");
				aspectUnit.getTag().add(declaredImplements); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition preceeds
				preceeds = KdmFactory.eINSTANCE.createTagDefinition();
				preceeds.setTag("proceeds");
				preceeds.setType("PointCut");
				aspectUnit.getTag().add(preceeds); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition precededBy
				precededBy = KdmFactory.eINSTANCE.createTagDefinition();
				precededBy.setTag("precededBy");
				precededBy.setType("PointCut");
				aspectUnit.getTag().add(precededBy); //Association of the tag into the stereotype 
				//****[End AspectUnit]****
				
				//****[Begin staticCrossCuttingFeature]****
				Stereotype staticCrossCuttingFeature = KdmFactory.eINSTANCE.createStereotype();
				staticCrossCuttingFeature.setName("staticCrossCuttingFeature");
				staticCrossCuttingFeature.setType("Package");
				lightweightExFamily.getStereotype().add(staticCrossCuttingFeature);//Add the stereotype into the extension family

				//Creation of the TagDefinition precededBy
				onType = KdmFactory.eINSTANCE.createTagDefinition();
				onType.setTag("onType");
				onType.setType("MethodUnit or StorableUnit");
				staticCrossCuttingFeature.getTag().add(onType); //Association of the tag into the stereotype 
				//****[End staticCrossCuttingFeature]****
				
				
				//****[Begin crossCuttingConcern]****
				Stereotype crossCuttingConcern = KdmFactory.eINSTANCE.createStereotype();
				crossCuttingConcern.setName("crossCuttingConcern");
				crossCuttingConcern.setType("Package");
				lightweightExFamily.getStereotype().add(crossCuttingConcern);//Add the stereotype into the extension family
				//****[End crossCuttingConcern]****
				
				//****[Begin pointCutUnit]****
				//This is an abstract element. It's not advised apply this stereotype
				Stereotype pointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				pointCutUnit.setName("pointCutUnit");
				pointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(pointCutUnit);//Add the stereotype into the extension family
				//****[End pointCutUnit]****
								
				//****[Begin compositePointCutUnit]****
				Stereotype compositePointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				compositePointCutUnit.setName("compositePointCutUnit");
				compositePointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(compositePointCutUnit);//Add the stereotype into the extension family
				
				//Creation of the TagDefinition composee
				composee = KdmFactory.eINSTANCE.createTagDefinition();
				composee.setTag("composee");
				composee.setType("MemberUnit");
				compositePointCutUnit.getTag().add(composee); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition composite
				composite = KdmFactory.eINSTANCE.createTagDefinition();
				composite.setTag("composite");
				composite.setType("MemberUnit");
				compositePointCutUnit.getTag().add(composite); //Association of the tag into the stereotype 
				
				
				//Creation of the TagDefinition compositionType
				compositionType = KdmFactory.eINSTANCE.createTagDefinition();
				compositionType.setTag("compositionType");
				compositionType.setType("MemberUnit");
				compositePointCutUnit.getTag().add(compositionType); //Association of the tag into the stereotype 
				//****[End compositePointCutUnit]****
				
				//****[Begin operationPointCutUnit]**** 
				Stereotype operationPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				operationPointCutUnit.setName("operationPointCutUnit");
				operationPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(operationPointCutUnit);//Add the stereotype into the extension family
				
				//Creation of the TagDefinition operation
				operation = KdmFactory.eINSTANCE.createTagDefinition();
				operation.setTag("operation");
				operation.setType("MemberUnit");
				operationPointCutUnit.getTag().add(operation); //Association of the tag into the stereotype 
				//****[End operationPointCutUnit]****
				
				
				//****[Begin withinCodePointCutUnit]****
				Stereotype withinCodePointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				withinCodePointCutUnit.setName("withinCodePointCutUnit");
				withinCodePointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(withinCodePointCutUnit);//Add the stereotype into the extension family
				//****[End withinCodePointCutUnit]****
				
				//****[Begin executionPointCutUnit]****
				Stereotype executionPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				executionPointCutUnit.setName("executionPointCutUnit");
				executionPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(executionPointCutUnit);//Add the stereotype into the extension family
				//****[End executionPointCutUnit]****
				
				//****[Begin callPointCutUnit]****
				Stereotype callPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				callPointCutUnit.setName("callPointCutUnit");
				callPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(callPointCutUnit);//Add the stereotype into the extension family
				//****[End callPointCutUnit]****
				
				
				//****[Begin preInitializationPointCutUnit]****
				Stereotype preInitializationPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				preInitializationPointCutUnit.setName("preInitializationPointCutUnit");
				preInitializationPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(preInitializationPointCutUnit);//Add the stereotype into the extension family
				//****[End preInitializationPointCutUnit]****
				
				//****[Begin adviceExecutionPointCutUnit]****
				Stereotype adviceExecutionPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				adviceExecutionPointCutUnit.setName("adviceExecutionPointCutUnit");
				adviceExecutionPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(adviceExecutionPointCutUnit);//Add the stereotype into the extension family
				//****[End adviceExecutionPointCutUnit]****
				
				//****[Begin propertyPointCutUnit]****
				//This is an abstract element. It's not possible apply this stereotype
				Stereotype propertyPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				propertyPointCutUnit.setName("propertyPointCutUnit");
				propertyPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(propertyPointCutUnit);//Add the stereotype into the extension family 
				//****[End propertyPointCutUnit]****
				
				//****[Begin getPointCutUnit]****
				Stereotype getPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				getPointCutUnit.setName("getPointCutUnit");
				getPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(getPointCutUnit);//Add the stereotype into the extension family
				//****[End getPointCutUnit]****
				
				//****[Begin setPointCutUnit]****
				Stereotype setPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				setPointCutUnit.setName("setPointCutUnit");
				setPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(setPointCutUnit);//Add the stereotype into the extension family
				//****[End setPointCutUnit]****
				
				
				//****[Begin adviceUnit]****
				Stereotype adviceUnit = KdmFactory.eINSTANCE.createStereotype();
				adviceUnit.setName("adviceUnit");
				adviceUnit.setType("ControlElement");
				lightweightExFamily.getStereotype().add(adviceUnit);//Add the stereotype into the extension family
				
				//Creation of the TagDefinition pointCutofAdvice
				pointCut = KdmFactory.eINSTANCE.createTagDefinition();
				pointCut.setTag("pointCut");
				pointCut.setType("pointCut");
				adviceUnit.getTag().add(pointCut); //Association of the tag into the stereotype 
				
				//Creation of the TagDefinition adviceExecutionType
				adviceExecutionType = KdmFactory.eINSTANCE.createTagDefinition();
				adviceExecutionType.setTag("adviceExecutionType");
				adviceExecutionType.setType("adviceExecutionType");
				adviceUnit.getTag().add(adviceExecutionType); //Association of the tag into the stereotype 
				//****[End adviceUnit]****
				
				
				//****[Begin PointCutPointCutUnit]****
				//This is an abstract element. It's not possible apply this stereotype
				Stereotype PointCutPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				PointCutPointCutUnit.setName("PointCutPointCutUnit");
				PointCutPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(PointCutPointCutUnit);//Add the stereotype into the extension family
				//****[End PointCutPointCutUnit]****
				
				//****[Begin cFlowPointCutUnit]****
				Stereotype cFlowPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				cFlowPointCutUnit.setName("cFlowPointCutUnit");
				cFlowPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(preInitializationPointCutUnit);//Add the stereotype into the extension family
				//****[End cFlowPointCutUnit]****
				
				//****[Begin cFlowBelowPointCutUnit]****
				Stereotype cFlowBelowPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				cFlowBelowPointCutUnit.setName("cFlowBelowPointCutUnit");
				cFlowBelowPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(cFlowBelowPointCutUnit);//Add the stereotype into the extension family
				//****[End cFlowBelowPointCutUnit]****
				
				//****[Begin typePointCutUnit]****
				Stereotype typePointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				typePointCutUnit.setName("typePointCutUnit");
				typePointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(typePointCutUnit);//Add the stereotype into the extension family

				//Creation of the TagDefinition adviceExecutionType
				type = KdmFactory.eINSTANCE.createTagDefinition();
				type.setTag("type");
				type.setType("type");//Look for the right one
				typePointCutUnit.getTag().add(type); //Association of the tag into the stereotype 
				//****[End typePointCutUnit]****
				
				//****[Begin withinPointCutUnit]****
				Stereotype withinPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				withinPointCutUnit.setName("withinPointCutUnit");
				withinPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(withinPointCutUnit);//Add the stereotype into the extension family
				//****[End withinPointCutUnit]****
				
				//****[Begin exceptionPointCutUnit]****
				Stereotype exceptionPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				exceptionPointCutUnit.setName("exceptionPointCutUnit");
				exceptionPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(exceptionPointCutUnit);//Add the stereotype into the extension family
				//****[End exceptionPointCutUnit]****
				
				//****[Begin staticInitializationPointCutUnit]****
				Stereotype staticInitializationPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				staticInitializationPointCutUnit.setName("staticInitializationPointCutUnit");
				staticInitializationPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(staticInitializationPointCutUnit);//Add the stereotype into the extension family
				//****[End staticInitializationPointCutUnit]****
				
				//****[Begin thisPointCutUnit]****
				Stereotype thisPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				thisPointCutUnit.setName("thisPointCutUnit");
				thisPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(thisPointCutUnit);//Add the stereotype into the extension family
				//****[End thisPointCutUnit]****
				
				//****[Begin argsPointCutUnit]****
				Stereotype argsPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				argsPointCutUnit.setName("argsPointCutUnit");
				argsPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(argsPointCutUnit);//Add the stereotype into the extension family
				//****[End argsPointCutUnit]****
				
				//****[Begin targetPointCutUnit]****
				Stereotype targetPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				targetPointCutUnit.setName("targetPointCutUnit");
				targetPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(targetPointCutUnit);//Add the stereotype into the extension family
				//****[End targetPointCutUnit]****
				
				//****[Begin contextExposingPointCutUnit]****
				//This is an abstract element. It's not possible apply this stereotype
				Stereotype contextExposingPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				contextExposingPointCutUnit.setName("contextExposingPointCutUnit");
				contextExposingPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(contextExposingPointCutUnit);//Add the stereotype into the extension family
				
				//Creation of the TagDefinition adviceExecutionType
				argsNames = KdmFactory.eINSTANCE.createTagDefinition();
				argsNames.setTag("argsNames");
				argsNames.setType("String");//Look for the right one
				contextExposingPointCutUnit.getTag().add(argsNames); //Association of the tag into the stereotype 
				
				//****[End contextExposingPointCutUnit]****
				
				//*****************[End Extension Family]**********************

				//return aspectUnit;
				return lightweightExFamily;
				
	}
	
}
