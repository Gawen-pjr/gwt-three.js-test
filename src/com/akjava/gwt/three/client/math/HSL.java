package com.akjava.gwt.three.client.math;

import com.google.gwt.core.client.JavaScriptObject;

public class HSL extends JavaScriptObject{

	public final native double h()/*-{
	return this.h;
	}-*/;
	
	public final native double s()/*-{
	return this.s;
	}-*/;
	
	public final native double l()/*-{
	return this.l;
	}-*/;
	
}
