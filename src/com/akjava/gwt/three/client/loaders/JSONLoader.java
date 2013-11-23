package com.akjava.gwt.three.client.loaders;

import com.akjava.gwt.three.client.core.Geometry;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;

public class JSONLoader extends Loader{

	protected JSONLoader(){}
	
	//show status not support
	public void load(String path,LoadHandler handler){
		load(path,handler,null);
	}
	public final native void load(String path,LoadHandler handler,String texturePath)/*-{
	//r46 version
	//instance of Object make a crush
	this.load(path,function ( geometry ) {
		handler.@com.akjava.gwt.three.client.loaders.JSONLoader$LoadHandler::loaded(Lcom/akjava/gwt/three/client/core/Geometry;)(geometry);
		},texturePath);
			
	//this.load({model:path,callback:function ( geometry ) {
	//	handler.@com.akjava.gwt.three.client.extras.loaders.JSONLoader$LoadHandler::loaded(Lcom/akjava/gwt/three/client/core/Geometry;)(geometry);
	//	}
	//});
	
	}-*/;
	
	public static interface LoadHandler {
		public void loaded(Geometry geometry);
	}

	
	public final native JavaScriptObject parse(JavaScriptObject json,String texturePath)/*-{
	return this.parse(json,texturePath);
	}-*/;
	
	/** @deprecated */
	public final native void createModel(JavaScriptObject object,LoadHandler handler,String texturepath)/*-{
	this.createModel(object,function ( geometry ) {
		handler.@com.akjava.gwt.three.client.loaders.JSONLoader$LoadHandler::loaded(Lcom/akjava/gwt/three/client/core/Geometry;)(geometry);
		},texturepath);

	}-*/;
	
	

	
	
}
