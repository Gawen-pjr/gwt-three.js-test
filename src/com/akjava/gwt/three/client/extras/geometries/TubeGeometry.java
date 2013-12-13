/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2013 akimisaki3@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r63
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2013 three.js Authors. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
  
 */
package com.akjava.gwt.three.client.extras.geometries;

import com.akjava.gwt.three.client.core.Geometry;
import com.akjava.gwt.three.client.extras.core.Path;
import com.akjava.gwt.three.client.math.Vector3;
import com.google.gwt.core.client.JsArray;


public class TubeGeometry extends Geometry{
	protected TubeGeometry() {
	}

	/**
	 * i'm not sure
	 * @return
	 */
public final native Path getPath()/*-{
return this.path;
}-*/;



public final native int getSegments()/*-{
return this.segments;
}-*/;



public final native double getRadius()/*-{
return this.radius;
}-*/;


public final native int getRadialSegments()/*-{
return this.radialSegments;
}-*/;



public final native boolean isClosed()/*-{
return this.closed;
}-*/;



public final native JsArray getGrid()/*-{
return this.grid;
}-*/;


public final native Object getNumpoints()/*-{
return this.numpoints;
}-*/;



public final native JsArray<Vector3> getTangents()/*-{
return this.tangents;
}-*/;



public final native  JsArray<Vector3> getNormals()/*-{
return this.normals;
}-*/;


public final native  JsArray<Vector3> getBinormals()/*-{
return this.binormals;
}-*/;




/**
 * i'm not sure
 * @param path
 * @param segments
 * @param closed
 */
public final native void FrenetFrames(Path path,int segments,boolean closed)/*-{
this.FrenetFrames(path,segments,closed);
}-*/;


}
