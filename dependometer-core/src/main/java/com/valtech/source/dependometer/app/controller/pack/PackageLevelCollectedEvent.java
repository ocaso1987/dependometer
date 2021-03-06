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
package com.valtech.source.dependometer.app.controller.pack;

import com.valtech.source.dependometer.app.controller.project.LevelCollectedEvent;
import com.valtech.source.dependometer.app.core.elements.EntityTypeEnum;

/**
 * @author Dietmar Menges (dietmar.menges@valtech.de)
 */
public final class PackageLevelCollectedEvent extends LevelCollectedEvent
{
   @Override
   public EntityTypeEnum getEntityType()
   {
      return EntityTypeEnum.PACKAGE;
   }
}
