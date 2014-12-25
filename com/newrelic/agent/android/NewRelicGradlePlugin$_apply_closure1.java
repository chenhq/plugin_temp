// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewRelicGradlePlugin.groovy

package com.newrelic.agent.android;

import groovy.lang.*;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;

class project extends Closure
    implements GeneratedClosure
{

    public Object doCall(Object it)
    {
        CallSite acallsite[] = $getCallSiteArray();
        if(DefaultTypeTransformation.booleanUnbox(acallsite[0].call(it, "android")))
        {
            acallsite[1].call(project.get(), ScriptBytecodeAdapter.createMap(new Object[] {
                "type", $get$$class$com$newrelic$agent$android$NewRelicInstrumentTask()
            }), "newRelicInstrumentTask");
            acallsite[2].call(project.get(), ScriptBytecodeAdapter.createMap(new Object[] {
                "type", $get$$class$com$newrelic$agent$android$NewRelicDeinstrumentTask()
            }), "newRelicDeinstrumentTask");
            acallsite[3].call(acallsite[4].callGetProperty(acallsite[5].callGroovyObjectGetProperty(this)), new closure2(this, getThisObject()));
            return acallsite[6].call(acallsite[7].callGetProperty(acallsite[8].callGroovyObjectGetProperty(this)), new closure3(this, getThisObject()));
        } else
        {
            return null;
        }

        // translate
//        as[0] = "hasProperty";
//        as[1] = "task";
//        as[2] = "task";
//        as[3] = "all";
//        as[4] = "applicationVariants";
//        as[5] = "android";
//        as[6] = "all";
//        as[7] = "testVariants";
//        as[8] = "android";
//        as[9] = "doCall";

        if (it.hasProperty("android")) {
            project.get().task("type" --> new)
        }

    }

    public Project getProject()
    {
        CallSite acallsite[] = $getCallSiteArray();
        return (Project)ScriptBytecodeAdapter.castToType(project.get(), $get$$class$org$gradle$api$Project());
    }

    public Object doCall()
    {
        CallSite acallsite[] = $getCallSiteArray();
        return acallsite[9].callCurrent(this, ScriptBytecodeAdapter.createPojoWrapper(null, $get$$class$java$lang$Object()));
    }

    protected MetaClass $getStaticMetaClass()
    {
        if(getClass() != $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1())
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
        as[0] = "hasProperty";
        as[1] = "task";
        as[2] = "task";
        as[3] = "all";
        as[4] = "applicationVariants";
        as[5] = "android";
        as[6] = "all";
        as[7] = "testVariants";
        as[8] = "android";
        as[9] = "doCall";
    }

    private static CallSiteArray $createCallSiteArray()
    {
        String as[] = new String[10];
        $createCallSiteArray_1(as);
        return new CallSiteArray($get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1(), as);
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

    private static Class $get$$class$org$gradle$api$Project()
    {
        return $class$org$gradle$api$Project == null && ($class$org$gradle$api$Project = _mthclass$("org.gradle.api.Project")) == null ? $class$org$gradle$api$Project : $class$org$gradle$api$Project;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1()
    {
        return $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1 == null && ($class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1 = _mthclass$("com.newrelic.agent.android.NewRelicGradlePlugin$_apply_closure1")) == null ? $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1 : $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1;
    }

    private static Class $get$$class$java$lang$Object()
    {
        return $class$java$lang$Object == null && ($class$java$lang$Object = _mthclass$("java.lang.Object")) == null ? $class$java$lang$Object : $class$java$lang$Object;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicDeinstrumentTask()
    {
        return $class$com$newrelic$agent$android$NewRelicDeinstrumentTask == null && ($class$com$newrelic$agent$android$NewRelicDeinstrumentTask = _mthclass$("com.newrelic.agent.android.NewRelicDeinstrumentTask")) == null ? $class$com$newrelic$agent$android$NewRelicDeinstrumentTask : $class$com$newrelic$agent$android$NewRelicDeinstrumentTask;
    }

    private static Class $get$$class$com$newrelic$agent$android$NewRelicInstrumentTask()
    {
        return $class$com$newrelic$agent$android$NewRelicInstrumentTask == null && ($class$com$newrelic$agent$android$NewRelicInstrumentTask = _mthclass$("com.newrelic.agent.android.NewRelicInstrumentTask")) == null ? $class$com$newrelic$agent$android$NewRelicInstrumentTask : $class$com$newrelic$agent$android$NewRelicInstrumentTask;
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

    private Reference project;
    private static ClassInfo $staticClassInfo;
    public static transient boolean __$stMC;
    private static SoftReference $callSiteArray;
    private static Class $class$org$gradle$api$Project;
    private static Class $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1;
    private static Class $class$java$lang$Object;
    private static Class $class$com$newrelic$agent$android$NewRelicDeinstrumentTask;
    private static Class $class$com$newrelic$agent$android$NewRelicInstrumentTask;

    static 
    {
        __$swapInit();
    }

    public closure3..getCallSiteArray(Object _outerInstance, Object _thisObject, Reference project)
    {
        CallSite acallsite[] = $getCallSiteArray();
        super(_outerInstance, _thisObject);
        Reference reference = project;
        this.project = reference;
        Reference _tmp = reference;
    }

    // Unreferenced inner class com/newrelic/agent/android/NewRelicGradlePlugin$_apply_closure1_closure2
    class NewRelicGradlePlugin._apply_closure1_closure2 extends Closure
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

            public NewRelicGradlePlugin._apply_closure1_closure2(Object _outerInstance, Object _thisObject)
            {
                CallSite acallsite[] = $getCallSiteArray();
                super(_outerInstance, _thisObject);
            }
    }


    // Unreferenced inner class com/newrelic/agent/android/NewRelicGradlePlugin$_apply_closure1_closure3
    class NewRelicGradlePlugin._apply_closure1_closure3 extends Closure
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
            if(getClass() != $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3())
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
            return new CallSiteArray($get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3(), as);
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

        private static Class $get$$class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3()
        {
            return $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3 == null && ($class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3 = _mthclass$("com.newrelic.agent.android.NewRelicGradlePlugin$_apply_closure1_closure3")) == null ? $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3 : $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3;
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
        private static Class $class$com$newrelic$agent$android$NewRelicGradlePlugin$_apply_closure1_closure3;

        static 
        {
            __$swapInit();
        }

            public NewRelicGradlePlugin._apply_closure1_closure3(Object _outerInstance, Object _thisObject)
            {
                CallSite acallsite[] = $getCallSiteArray();
                super(_outerInstance, _thisObject);
            }
    }

}
