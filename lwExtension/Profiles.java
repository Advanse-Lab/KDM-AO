package lightweight_extension;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import kdm.code.CodePackage;
import kdm.kdm.ExtensionFamily;
import kdm.kdm.KdmFactory;
import kdm.kdm.Segment;
import kdm.kdm.Stereotype;
import kdm.kdm.TagDefinition;

/*import PesadoKDM.kdm.code.CodePackage;
import PesadoKDM.kdm.kdm.ExtensionFamily;
import PesadoKDM.kdm.kdm.KdmFactory;
import PesadoKDM.kdm.kdm.Segment;
import PesadoKDM.kdm.kdm.Stereotype;
import PesadoKDM.kdm.kdm.TagDefinition;*/

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
	public static Stereotype executionPointCut;
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
				
				//****[Begin AspectUnit]****
				//public static Stereotype pointCutUnit;
				//****[End AspectUnit]****
								
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
				aspectUnit.getTag().add(operation); //Association of the tag into the stereotype 
				//****[End operationPointCutUnit]****
				
				
				//****[Begin withinCodePointCutUnit]****
				Stereotype withinCodePointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				withinCodePointCutUnit.setName("withinCodePointCutUnit");
				withinCodePointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(withinCodePointCutUnit);//Add the stereotype into the extension family
				//****[End withinCodePointCutUnit]****
				
				//****[Begin executionPointCut]****
				Stereotype executionPointCut = KdmFactory.eINSTANCE.createStereotype();
				executionPointCut.setName("executionPointCut");
				executionPointCut.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(executionPointCut);//Add the stereotype into the extension family
				//****[End executionPointCut]****
				
				//****[Begin callPointCutUnit]****
				Stereotype callPointCutUnit = KdmFactory.eINSTANCE.createStereotype();
				callPointCutUnit.setName("callPointCutUnit");
				callPointCutUnit.setType("MemberUnit");
				lightweightExFamily.getStereotype().add(callPointCutUnit);//Add the stereotype into the extension family
				//****[End callPointCutUnit]****
				
				/*
				//****[Begin preInitializationPointCutUnit]****
				public static Stereotype preInitializationPointCutUnit;
				//****[End preInitializationPointCutUnit]****
				
				//****[Begin adviceExecutionPointCutUnit]****
				public static Stereotype adviceExecutionPointCutUnit;
				//****[End adviceExecutionPointCutUnit]****
				
				//****[Begin propertyPointCutUnit]****
				public static Stereotype propertyPointCutUnit;
				//****[End propertyPointCutUnit]****
				
				//****[Begin getPointCutUnit]****
				public static Stereotype getPointCutUnit;
				//****[End getPointCutUnit]****
				
				//****[Begin setPointCutUnit]****
				public static Stereotype setPointCutUnit;
				//****[End setPointCutUnit]****
				*/
				
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
				
				/*
				//****[Begin PointCutPointCutUnit]****
				public static Stereotype PointCutPointCutUnit;
				//****[End PointCutPointCutUnit]****
				
				//****[Begin cFlowPointCutUnit]****
				public static Stereotype cFlowPointCutUnit;
				//****[End cFlowPointCutUnit]****
				
				//****[Begin cFlowBelowPointCutUnit]****
				public static Stereotype cFlowBelowPointCutUnit;
				//****[End cFlowBelowPointCutUnit]****
				
				//****[Begin typePointCutUnit]****
				public static Stereotype typePointCutUnit;
				public static TagDefinition type;
				//****[End typePointCutUnit]****
				
				//****[Begin withinPointCutUnit]****
				public static Stereotype withinPointCutUnit;
				//****[End withinPointCutUnit]****
				
				//****[Begin exceptionPointCutUnit]****
				public static Stereotype exceptionPointCutUnit;
				//****[End exceptionPointCutUnit]****
				
				//****[Begin staticInitializationPointCutUnit]****
				public static Stereotype staticInitializationPointCutUnit;
				//****[End staticInitializationPointCutUnit]****
				
				//****[Begin thisPointCutUnit]****
				public static Stereotype thisPointCutUnit;
				//****[End thisPointCutUnit]****
				
				//****[Begin argsPointCutUnit]****
				public static Stereotype argsPointCutUnit;
				//****[End argsPointCutUnit]****
				
				//****[Begin targetPointCutUnit]****
				public static Stereotype targetPointCutUnit;
				//****[End targetPointCutUnit]****
				
				//****[Begin contextExposingPointCutUnit]****
				public static Stereotype contextExposingPointCutUnit;
				public static TagDefinition argsNames;
				//****[End contextExposingPointCutUnit]****
				 * 
				 */
				
				//*****************[End Extension Family]**********************

				//return aspectUnit;
				return lightweightExFamily;
				
	}
	
}
