package com.akjava.gwt.three.client.gwt.ui;

import com.akjava.gwt.three.client.js.THREE;
import com.akjava.gwt.three.client.js.renderers.WebGLRenderer;
//TODO move somewhere not here
public class CanvasBuilder extends WebGLBuilder{
	
	WebGLRenderer createRenderer(){
		return THREE.CanvasRenderer();
	}
}
