// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewRelicGradlePlugin.groovy

package com.newrelic.agent.android;

import groovy.lang.Closure;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

class .getCallSiteArray extends Closure
    implements GeneratedClosure
{

    public Object doCall(Object variant)
    {
        CallSite acallsite[] = $getCallSiteArray();
        acallsite[0].call(acallsite[1].callGetProperty(variant), "newRelicInstrumentTask");
        acallsite[2].call(acallsite[3].callGetProperty(variant), "newRelicDeinstrumentTask");
        return acallsite[4].call(acallsite[5].callGroovyObjectGetProperty(this), acallsite[6].call(acallsite[7].call("[newrelic] Added instrumentation tasks to ", acallsite[8].callGetProperty(variant)), " variant."));
    }

    protected MetaClass $getStaticMetaClass()
    {
        if(getClass() != $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2())
            return ScriptBytecodeAdapter.initMetaClass(this);
        ClassInfo classinfo = $staticClassInfo;
        if(classinfo == null)
            $staticClassInfo = classinfo = ClassInfo.getClassInfo(getClass());
        return classinfo.getMetaClass();
    }

    public static void __$swapInit()
    {
        CallSite acallsite[] = $getCallSiteArray();
        $callSiteArray = null;
    }

    private static void $createCallSiteArray_1(String as[])
    {
        as[0] = "dependsOn";
        as[1] = "dex";
        as[2] = "finalizedBy";
        as[3] = "dex";
        as[4] = "info";
        as[5] = "logger";
        as[6] = "plus";
        as[7] = "plus";
        as[8] = "name";
    }

    private static CallSiteArray $createCallSiteArray()
    {
        String as[] = new String[9];
        $createCallSiteArray_1(as);
        return new CallSiteArray($get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2(), as);
    }

    private static CallSite[] $getCallSiteArray()
    {
        CallSiteArray callsitearray;
        if($callSiteArray == null || (callsitearray = (CallSiteArray)$callSiteArray.get()) == null)
        {
            callsitearray = $createCallSiteArray();
            $callSiteArray = new SoftReference(callsitearray);
        }
        return callsitearray.array;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2()
    {
        return $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2 == null && ($class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2 = _mthclass$("com.newrelic.agent.android.NewRelicGradlePlugin$_apply_closure1_closure2")) == null ? $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2 : $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static ClassInfo $staticClassInfo;
    public static transient boolean __$stMC;
    private static SoftReference $callSiteArray;
    private static Class $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure2;

    static 
    {
        __$swapInit();
    }

    public (Object _outerInstance, Object _thisObject)
    {
        CallSite acallsite[] = $getCallSiteArray();
        super(_outerInstance, _thisObject);
    }
}
