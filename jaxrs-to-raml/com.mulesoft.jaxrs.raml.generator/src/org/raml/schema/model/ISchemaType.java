package org.raml.schema.model;

import java.util.List;
import java.util.Map;

import com.mulesoft.jaxrs.raml.jaxb.StructureType;

public interface ISchemaType {
	
	Map<String,String> getNamespaces();
	
	String getName();
	
	boolean isSimple();
	
	boolean isComplex();
	
	List<ISchemaProperty> getProperties();
	
	String getQualifiedPropertyName(ISchemaProperty prop);
	
	String getClassName();
	
	String getClassQualifiedName();
	
	StructureType getParentStructureType();
}
