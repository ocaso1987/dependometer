/*
 * Copyright 2009 Valtech GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.valtech.source.dependometer.ui.console.output;

import java.io.File;
import java.io.PrintWriter;

import com.valtech.source.dependometer.app.core.provider.DependencyElementIf;

/**
 * @author Dietmar Menges (dietmar.menges@valtech.de)
 */
final class HtmlCompilationUnitDocument extends HtmlDependencyElementDocument
{
   protected HtmlCompilationUnitDocument(File directory, DependencyElementIf element,
      String metricDescriptionsDocumentName)
   {
      super(directory, element, metricDescriptionsDocumentName);
   }

   protected boolean showRelationQualifier()
   {
      return false;
   }

   protected boolean showTypeRelations()
   {
      return true;
   }

   protected boolean showRelationQualifierForContained()
   {
      return true;
   }

   protected boolean showAllowedDependencies()
   {
      return false;
   }

   protected void writeAdditionalLinks()
   {
      if (getDependencyElement().hasViewableSourceFile())
      {
         PrintWriter writer = getWriter();
         writer.println("<tr><td>");
         String relPath = PathConverter.getInstance().getRelativePath(getDirectory(),
            getDependencyElement().getAbsoluteSourcePath());
         writeHRef(relPath, "[source]");
         writer.println("</td></tr>");
      }
   }

   protected boolean showTypeRelationsInInnerDependencies()
   {
      return false;
   }

   protected boolean showComponentDependency()
   {
      return true;
   }

   protected boolean showRelationQualifierInInnerDependencies()
   {
      return true;
   }
}