/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.tooling.structure;

import melnorme.lang.tooling.LANG_SPECIFIC;



/**
 * A structure element is a lightweight structure describing a top-level element 
 * obtained from a source file (compilation unit).
 * Example: functions, classes, top level variables. etc. 
 */
@LANG_SPECIFIC
public interface IStructureElement extends IStructureElement_Default {
	
}