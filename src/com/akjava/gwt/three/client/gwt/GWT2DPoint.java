package com.akjava.gwt.three.client.gwt;

import com.google.gwt.core.client.JavaScriptObject;


public class GWT2DPoint extends JavaScriptObject{

	protected GWT2DPoint(){}
	
	public   final native double getX()/*-{
	return this.x;
	}-*/;
	public   final native double getY()/*-{
	return this.y;
	}-*/;
	
	public   final native void setX(double x)/*-{
	 this.x=x;
	}-*/;
	public   final native void setY(double y)/*-{
	 this.y=y;
	}-*/;
	public   final native void set(double x,double y)/*-{
	this.x=x;
	this.y=y;
	}-*/;
	
	public  static final native GWT2DPoint create(double x,double y)/*-{
	var pt={"x":x,"y":y};
	return pt;
	}-*/;
}
