// GENERATED FILE!
// VERSION-INFO: com.valtech.source.ag.evf.codegen.Dispatcher
// DATE/TIME-INFO: 17.05.04 09:36:43

package com.valtech.source.dependometer.app.controller.compilationunit;

import com.valtech.source.ag.evf.Dispatcher;
import com.valtech.source.ag.evf.EventIf;

final class DispatcherMultiplePackageCompilationUnitCycleCollectedEvent extends Dispatcher
{
   protected void dispatch(Object handler, EventIf event)
   {
      assert handler != null;
      assert event != null;
      ((HandleMultiplePackageCompilationUnitCycleCollectedEventIf)handler)
         .handleEvent((com.valtech.source.dependometer.app.controller.compilationunit.MultiplePackageCompilationUnitCycleCollectedEvent)event);
   }
}
