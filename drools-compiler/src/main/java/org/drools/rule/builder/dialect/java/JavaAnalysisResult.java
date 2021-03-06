/*
 * Copyright 2006 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created on Jun 18, 2007
 */
package org.drools.rule.builder.dialect.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.drools.compiler.AnalysisResult;
import org.drools.compiler.BoundIdentifiers;
import org.drools.rule.builder.dialect.java.parser.JavaBlockDescr;
import org.drools.rule.builder.dialect.java.parser.JavaLocalDeclarationDescr;

/**
 * An analysis result implementation for the java dialect
 */
public class JavaAnalysisResult implements AnalysisResult {
    
    private BoundIdentifiers boundIdentifiers = null;
    private Set<String> identifiers = Collections.emptySet();
    private Map<String,JavaLocalDeclarationDescr> localVariables = Collections.emptyMap();
    private Set<String> notBoundedIdentifiers = Collections.emptySet();
    private List<JavaBlockDescr> blocks = Collections.emptyList();
    private boolean modifyExpr;
    
    public BoundIdentifiers getBoundIdentifiers() {
        return boundIdentifiers;
    }
    public void setBoundIdentifiers(BoundIdentifiers boundIdentifiers) {
        this.boundIdentifiers = boundIdentifiers;
    }
    public Set<String> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(Set<String> identifiers) {
        this.identifiers = identifiers;
    }
    public Set<String> getLocalVariables() {
        return localVariables.keySet();
    }
    public Map<String,JavaLocalDeclarationDescr> getLocalVariablesMap() {
        return this.localVariables;
    }
    public void setLocalVariables(Map<String,JavaLocalDeclarationDescr> localVariables) {
        this.localVariables = localVariables;
    }
    public void addLocalVariable( String identifier, JavaLocalDeclarationDescr descr ) {
        this.localVariables.put( identifier, descr );
    }
    public Set<String> getNotBoundedIdentifiers() {
        return notBoundedIdentifiers;
    }
    public void setNotBoundedIdentifiers(Set<String> notBoundedIdentifiers) {
        this.notBoundedIdentifiers = notBoundedIdentifiers;
    }
    public List<JavaBlockDescr> getBlockDescrs() {
        return blocks;
    }
    public void setBlockDescrs(List<JavaBlockDescr> blocks) {
        this.blocks = blocks;
    }
    public boolean isModifyExpr() {
        return modifyExpr;
    }
    public void setModifyExpr(boolean modifyExpr) {
        this.modifyExpr = modifyExpr;
    }
        
}
